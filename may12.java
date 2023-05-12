import java.util.Scanner;

public class may12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if (str1.equalsIgnoreCase(str2)) {
                System.out.println("The strings are equal");
            } else {
                System.out.println("The strings are not equal");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}