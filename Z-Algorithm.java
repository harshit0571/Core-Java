import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        String text = "CDCDCCCDCCCCC";
        String Pattern = "CDC";

        // Step #1 : Concatenation
        String concatString = Pattern + "$" + text;

        // Step #2 : Generate Z Array
        int Z[] = new int[concatString.length()];
        int n = Z.length;
        Z[0] = 0;
        int start = 0;
        int end = 0;

        // process each string
        for (int i = 1; i < n; i++) {
            if (i > end) {
                // 'i' is outside the window
                start = i;
                end = i;
                while (end < n && concatString.charAt(end) == concatString.charAt(end - start)) {
                    end++;
                }
                end--;
                Z[i] = end - start + 1;
            } else {
                // 'i' is inside the window
                if (Z[i - start] < (end - i + 1)) {
                    Z[i] = Z[i - start];
                } else {
                    start = i;
                    while (end < n && concatString.charAt(end) == concatString.charAt(end - start)) {
                        end++;
                    }
                    end--;
                    Z[i] = end - start + 1;
                }
            }
        }
        System.out.println("Text : " + text);
        System.out.println("Pattern : " + Pattern);
        System.out.println(Arrays.toString(concatString.toCharArray()));
        System.out.println(Arrays.toString(Z));
    }
}