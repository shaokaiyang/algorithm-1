import java.util.Stack;

/**
 * Notes:
 * 栈空指针异常
 *
 * @author sunxiaoyang
 */
public class _20_Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char i : s.toCharArray()) {
            switch (i) {
                case '(':
                case '[':
                case '{':
                    st.push(i);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!st.isEmpty() && isPair(st.peek(), i)) {
                        st.pop();
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return st.isEmpty();
    }

    boolean isPair(char left, char right) {
        if ((left == '(' && right == ')')
                || (left == '[' && right == ']')
                || (left == '{' && right == '}'))
            return true;
        return false;
    }


    public static void main(String[] args) {
        _20_Valid_Parentheses a = new _20_Valid_Parentheses();
        System.out.println(a.isValid(")[)]{}"));
    }
}
