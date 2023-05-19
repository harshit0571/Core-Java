import java.util.Scanner;

public class left {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String inp=sc.nextLine();
        String inp = "geeksforeeks";
        boolean flag = false;

        for (int i = 0; i < inp.length(); i++) {
            for (int j = i + 1; j < inp.length(); j++) {
                if (inp.charAt(i) == inp.charAt(j)) {
                    flag = true;
                    System.out.println(inp.charAt(i));
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}