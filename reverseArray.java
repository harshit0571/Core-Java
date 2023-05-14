public class reverseArray {
    public static void main(String[] args) {
        String[] symbol = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int[] value = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        for (int i = value.length - 1; i >= 0; i--) {
            System.out.print(value[i] + ",");
        }
        System.out.println();
        for (int i = symbol.length - 1; i >= 0; i--) {
            System.out.print("\"" + symbol[i] + "\"" + ",");
        }
    }
}
