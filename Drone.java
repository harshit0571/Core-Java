import java.io.*;
import java.util.Scanner;

public class Drone {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        int comp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < comp) {
                comp = arr[i];
            } else {
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
