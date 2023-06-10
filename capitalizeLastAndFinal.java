public class capitalizeLastAndFinal {
    public static void main(String[] args) {
        String s = "hello my name is harshit";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] arr = str[i].toCharArray();
            if (arr[0] >= 'a' && arr[0] <= 'z') {
                arr[0] = (char) (arr[0] - 32);
            }
            if (arr[arr.length - 1] >= 'a' && arr[arr.length - 1] <= 'z') {
                arr[arr.length - 1] = (char) (arr[arr.length - 1] - 32);
            }
            String temp = new String(arr);
            str[i] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}