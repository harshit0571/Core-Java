import java.util.Stack;

public class infixToPostFIX {
    static int prec(char a) {
        if (a == '*' || a == '/') {
            return 3;
        } else if (a == '+' || a == '-') {
            return 2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "A+B*C+D";
        String ans = "";
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
                ans = ans + s.charAt(index);
            } else if (s.charAt(index) == '(') {
                st.push(s.charAt(index));
            } else if (s.charAt(index) == ')') {
                while (!st.empty() && st.peek() != ')') {
                    ans = ans + st.peek();
                    st.pop();
                }
                if (!st.empty()) {
                    st.pop();
                }
            } else {
                while (!st.empty() && prec(s.charAt(index)) <= prec(st.peek())) {
                    ans = ans + st.peek();
                    st.pop();
                }
                st.push(s.charAt(index));
            }
        }
        while (!st.empty()) {
            ans = ans + st.peek();
            st.pop();
        }
        System.out.println(ans);
    }
}
