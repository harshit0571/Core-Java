class reverseWithoutAPI {
    public static void main(String a[]) {
        String str = "Java 2 career";
        String arr[] = str.split(" ");
        System.out.print("Reversed String of " + str + ":");
        for (int i = arr.length - 1; i >= 0; i--) {
            char temp[] = arr[i].toCharArray();
            for (int j = temp.length - 1; j >= 0; j--) {
                System.out.print(temp[j]);

            }
            System.out.print(" ");
        }
    }

}

import java.util.Scanner;

/**
 *  * Easiest way to check Given String is Palindrome String or not
 *  * @author includehelp
 *  
 */
public class PalindromString {

    static boolean isPalindromString(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr);
        String reverseStr = sb.reverse().toString();

        return (inputStr.equalsIgnoreCase(reverseStr));
    }

    public class DuplStr {
        public static void main(String argu[]) {

            String str = "w3schools";
            int cnt = 0;
            char[] inp = str.toCharArray();
            System.out.println("Duplicate Characters are:");
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (inp[i] == inp[j]) {
                        System.out.println(inp[j]);
                        cnt++;
                        break;
                    }
                }
            }
        }
    }
}