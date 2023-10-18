import java.util.Scanner;

public class TripletFromLinkedList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int z = inp.nextInt();
        int A[] = new int[x];
        int B[] = new int[y];
        int C[] = new int[z];
        for (int i = 0; i < x; i++) {
            A[i] = inp.nextInt();
        }
        for (int i = 0; i < y; i++) {
            B[i] = inp.nextInt();
        }
        for (int i = 0; i < z; i++) {
            C[i] = inp.nextInt();
        }
        int t = inp.nextInt();

        boolean flag = false;
        for (int i = 0; i < x; i++) {
            int sum = A[i];
            for (int j = 0; j < y; j++) {
                sum += B[j];
                for (int k = 0; k < x; k++) {
                    sum += C[k];
                    if (sum == t) {
                        System.out.println(A[i] + " " + B[j] + " " + C[k]);
                        flag = true;
                        break;
                    }
                    sum -= C[k];
                }
                if (flag) {
                    break;
                }
                sum -= B[j];
            }
            if (flag) {
                break;
            }
        }

    }
}
