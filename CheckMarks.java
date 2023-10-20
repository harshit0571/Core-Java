import java.util.Scanner;

public class CheckMarks {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char co[] = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int n = inp.nextInt();
        char[][] arr = new char[n][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = inp.next().charAt(0);
            }
        }

        for (int i = 0; i < n; i++) {
            int marks = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == co[j]) {
                    marks++;
                }
            }
            System.out.println(marks);
        }

    }
}
