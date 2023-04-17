import java.util.Scanner;

//       1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11
public class pattern_question {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i - 1; j++) {
                System.out.print(k + " ");
                k++;
            }
            for (int j = 0; j < n; j++) {
                System.out.print("");
            }
        }

    }
}
