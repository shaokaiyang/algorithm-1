import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _22_Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n > 0) res.add("");
        for (int i = 0; i < n; i++) {
            HashSet<String> temp = new HashSet<>();
            for (String s : res) {
                for (int j = 0; j <= s.length(); j++) {
                    String t = s.substring(0, j) + "()" + s.substring(j, s.length());
                    temp.add(t);
                }
            }
            res.clear();
            res.addAll(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        _22_Generate_Parentheses a = new _22_Generate_Parentheses();
        System.out.println(a.generateParenthesis(3));
    }
}
