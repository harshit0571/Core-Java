import java.util.Arrays;
import java.util.Scanner;
// Write a method in Java which will remove any given character from a String.

// public class asingment {
//     static void shift(char[] arr, int index) {
//         for (int i = index; i < arr.length - 1; i++) {
//             char temp = arr[i + 1];
//             arr[i + 1] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     static void remove(char[] arr, char ch) {

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == ch) {
//                 shift(arr, i);
//             }
//         }
//     }

//     public static void main(String args[]) {

//         Scanner inp = new Scanner(System.in);
//         String s = inp.nextLine();
//         char[] arr = s.toCharArray();
//         char ch = inp.next().charAt(0);
//         remove(arr, ch);
//         for (int i = 0; i < arr.length - 1; i++) {
//             System.out.print(arr[i]);
//         }
//     }
// }

// Write a program in Java to count occurrence of a given character in a String.
// public class asingment {
//     static void Count(char arr[], char ch) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (ch == arr[i]) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }

//     public static void main(String args[]) {
//         Scanner inp = new Scanner(System.in);
//         String s = inp.nextLine();
//         char ch = inp.next().charAt(0);
//         char arr[] = s.toCharArray();
//         Count(arr, ch);
//     }
// }

// Java Program to count the occurrence of duplicate characters in String.
public class asingment {
    static int count(char arr[], char c) {
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c && arr[i] != '_') {
                Count++;
                arr[i] = '_';
            }
        }
        return Count;
    }

    static void Duplicate(char arr[]) {
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            char a = arr[i];
            Count = count(arr, arr[i]);
            if (Count > 1 && a != '_') {
                System.out.println(a + " : " + Count);
            }
        }

    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        char[] arr = s.toCharArray();
        System.out.println(a);
        Duplicate(arr);

    }
}

// public class asingment {
// static Boolean Anagram(char a1[], char a2[]) {
// Arrays.sort(a1);
// Arrays.sort(a2);
// Boolean a = Arrays.equals(a1, a2);
// return a;
// }

// public static void main(String args[]) {
// Scanner inp = new Scanner(System.in);
// String s1 = inp.nextLine();
// String s2 = inp.nextLine();
// char[] a1 = s1.toCharArray();
// char[] a2 = s2.toCharArray();
// Boolean a = Anagram(a1, a2);
// System.out.println(a);

// }
// }
