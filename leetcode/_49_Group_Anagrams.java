import java.util.*;

/**
 * @author sunxiaoyang
 */
public class _49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return null;
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> point = new HashMap<>();
        for (String s : strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String hs = Arrays.toString(t);
            if (point.get(hs) == null) {
                List<String> temp = new ArrayList<>();
                res.add(temp);
                temp.add(s);
                point.put(hs, res.size() - 1);
            } else {
                res.get(point.get(hs)).add(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _49_Group_Anagrams a = new _49_Group_Anagrams();
        String[] in = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(a.groupAnagrams(in));
    }
}