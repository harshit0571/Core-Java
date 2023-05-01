import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row = inp.nextInt();
        int col;

        int arr[][] = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter column");
            col = inp.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
};

// 1 2 3
// 4 5
// 1 5 6 6 6

// 1 2 3
// 4 5
// 1 5 6 6 6
