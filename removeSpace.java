import java.util.Scanner;

public class removeSpace {
    static void shift(char arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            char temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != ' ') {
                if (arr[i] == ' ') {
                    shift(arr, i);
                    count++;
                }
            }
        }
        for (int i = 0; i <= arr.length - count; i++) {
            System.out.print(arr[i]);
        }
    }
}