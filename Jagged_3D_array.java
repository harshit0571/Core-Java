import java.util.Scanner;

public class Jagged_3D_array {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int n2;
        int n3;
        
        int[][][] arr=new int[n][][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter size of outer array");
            n2=inp.nextInt();
            arr[i]=new int[n2][];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter size of inner array");
                n3=inp.nextInt();
                arr[i][j]= new int[n3];
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                    arr[i][j][j2]=inp.nextInt();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[");
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                    System.out.print(arr[i][j][j2]+",");
                }
                System.out.print("]");
                System.out.print(" , ");
            }
            System.out.println();
        }

    }
}

