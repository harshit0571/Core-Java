public class digitval {
    static int toDig(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 10 + (s.charAt(i) - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "asdfrd12fgd78jchf";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                // sum=sum+Character.getNumericValue(s.charAt(i));
                String dig = "";
                while (Character.isDigit(s.charAt(i))) {
                    dig = dig + s.charAt(i);
                    i++;
                }
                sum = sum + toDig(dig);
            }
        }
        System.out.println(sum);
    }
}
