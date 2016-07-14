import java.util.HashMap;

/**
 * @author sunxiaoyang
 */
public class _3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> temp = new HashMap<>();
        char[] v = s.toCharArray();
        int res = 0, cur = 0, last = -1;

        for (int i = 0; i < v.length; i++) {
            if (temp.get(v[i]) != null && temp.get(v[i]) > last) {
                res = Math.max(res, cur);
                cur = i - temp.get(v[i]) - 1;
                last = temp.get(v[i]);
            }
            temp.put(v[i], i);
            cur++;
        }
        return Math.max(res, cur);
    }

    public static void main(String[] args) {
        _3_Longest_Substring_Without_Repeating_Characters a = new _3_Longest_Substring_Without_Repeating_Characters();
        System.out.println(a.lengthOfLongestSubstring("abcabcbb"));
    }
}
