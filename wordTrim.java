import java.util.Scanner;

public class wordTrim {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String arr[] = s.split(" ");
        System.out.println("number of words = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].charAt(0) + " " + (int) arr[i].charAt(0));
            System.out.println();
        }
    }
}
