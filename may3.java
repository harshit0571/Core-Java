public class may3 {
    public static void main(String args[]) {
        // try {
        // int[] arr = { 1, 2, 3 };
        // System.out.println(arr[10]);
        // } catch (Exception e) {
        // System.out.println("error");
        // }
        // try {
        // int d = 0;
        // d = d / d;
        // } catch (Exception e) {
        // System.out.println("error");
        // }
        // try {
        // int[] arr = { 1, 2, 3 };
        // System.out.println(arr[10]);
        // } catch (Exception e) {
        // try {
        // System.out.println(e + ".");
        // int[] arr = { 1, 2, 3 };
        // System.out.println(arr[9]);
        // } catch (Exception et) {
        // System.out.println("nested error");
        // }
        // }
        try {
            int a = 10 / 0;
            int[] arr = { 1 };
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // catch (ArrayIndexOutOfBoundsException e2) {
        // System.out.println("array");
        // }
    }
}
