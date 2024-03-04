import java.util.HashSet;

public class Interview2 {

    static boolean NonRep(String s, char c, int index) {
        for (int i = index + 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         // String s = "mississippi";
        // boolean flag = false;
        // for (int i = 0; i < s.length(); i++) {
        // flag = NonRep(s, s.charAt(i), i);
        // if (flag) {
        // System.out.println(s.charAt(i));
        // break;
        // }
        // }
        // if (!flag) {
        // System.out.println(-1);
        // }

        // int n = 100;

        // int count = 0;
        // for (int i = 1; i < n; i++) {
        // if (isPrime(i)) {
        // count++;
        // }
        // }
        // System.out.println(count);

        String a = "abc";
        String b = "dcb";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            if (set.contains(b.charAt(i))) {
                System.out.print(b.charAt(i));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (set.contains(b.charAt(i))) {
                System.out.print(b.charAt(i));
            }
        }

    }

}

// Given a string s, find the first non-repeating character in it and return its
// index. If it does not exist, return -1.

// [4:47 PM] Siva Natuva
// Given an integer n, return the number of prime numbers that are strictly less
// than n.

// string1 = "abc"; string2 = "dcb"; common characters = "bc";

// select * from usertable, dataTable right join u
// dataTable.Id;

//