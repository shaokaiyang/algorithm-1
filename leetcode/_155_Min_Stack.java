import java.util.Stack;

/**
 * @author sunxiaoyang
 */
public class _155_Min_Stack {

    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public void push(int x) {
        if (min.empty() || x < min.peek()) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
        st.push(x);
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
