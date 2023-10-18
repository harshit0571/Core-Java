import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthis {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    break;
                }
            } else if (s.charAt(i) == '}') {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    break;
                }
            } else if (s.charAt(i) == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else {
                    break;
                }
            } else if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
        }

        System.out.println(st.isEmpty());
    }
}
