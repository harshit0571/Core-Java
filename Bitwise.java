import java.util.Scanner;

public class Bitwise {
    public static void XOR(int n){
        System.out.println("n ^ 1 is " +(n^1));
    }
    public static void AND(int n){
        System.out.println("n & 1 is " +(n&1));
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        
        int arr[][]=new int[n][5];
        XOR(n);
        AND(n);
    }
}

