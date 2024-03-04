import java.util.Stack;

public class StockSpan {
    public static int[] findStockSpans(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        st.push(0);
        ans[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (!st.empty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);
        }
        return ans;
    }
}

// 5 4 3 2 7