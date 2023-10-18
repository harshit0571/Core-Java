import java.util.Scanner;

public class IndexOfSPecifiedPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String pat = inp.nextLine();

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == pat.charAt(0)) {
        // int k = 0;
        // boolean flag = true;
        // int j = i;
        // while (j < str.length() && k < pat.length()) {
        // if (str.charAt(j) != pat.charAt(k)) {
        // flag = false;
        // }
        // j++;
        // k++;
        // }
        // if (k >= pat.length() && flag) {
        // System.out.println(i);
        // break;
        // }
        // }
        // }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == pat.charAt(0) && (i + pat.length() < str.length())) {
                if (str.substring(i, i + pat.length()).equals(pat)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
