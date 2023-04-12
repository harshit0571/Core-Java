import java.util.Scanner;

public class Array_input {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=inp.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
}
