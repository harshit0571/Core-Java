import java.util.Scanner;

class InvalidEntry extends Exception {

    public InvalidEntry(String s) {
        super(s);
    }
}

public class InputValidationwithExceptionHandling {
    static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Scanner inp = new Scanner(System.in);
            String s = inp.nextLine();
            if (check(s)) {
                throw new InvalidEntry("invalid name");
            }
            int id = inp.nextInt();
            if (id <= 0) {
                throw new InvalidEntry("invalid id");
            }
            int sal = inp.nextInt();
            if (sal < 0) {
                throw new InvalidEntry("invalid salary");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
