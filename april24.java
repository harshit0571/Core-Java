public class april24 {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "def";
        // System.out.println(str + 10 + 5);
        // System.out.println(str + "hello");
        // System.out.println(str + 10 + "hello");
        // System.out.println(10 + 5 + str + 5);
        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        // System.out.println(str.indexOf('e'));

        // str.lenght(); function
        // c.lenght; property

        String a = "harshit";
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i) + " ");
        }
        System.out.println(a.indexOf('r'));
        System.out.println(a.substring(0, 1));
    }
}
