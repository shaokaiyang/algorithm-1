import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunxiaoyang
 */
public class _17_Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null) return null;
        if (digits.isEmpty()) return res;

        Map<Character, char[]> table = new HashMap<>();
        table.put('2', new char[]{'a', 'b', 'c'});
        table.put('3', new char[]{'d', 'e', 'f'});
        table.put('4', new char[]{'g', 'h', 'i'});
        table.put('5', new char[]{'j', 'k', 'l'});
        table.put('6', new char[]{'m', 'n', 'o'});
        table.put('7', new char[]{'p', 'q', 'r', 's'});
        table.put('8', new char[]{'t', 'u', 'v'});
        table.put('9', new char[]{'w', 'x', 'y', 'z'});

        res.add("");
        for (char i : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (char j : table.get(i)) {
                for (String s : res) {
                    temp.add(s + j);
                }
            }
            res = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        _17_Letter_Combinations_of_a_Phone_Number a = new _17_Letter_Combinations_of_a_Phone_Number();
        System.out.println(a.letterCombinations(""));
        System.out.println(a.letterCombinations("").size());
    }
}
