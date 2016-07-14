/**
 * @author sunxiaoyang
 */
public class _5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if (s == null) return null;

        int l = 0, r = 1;
        char[] v = s.toCharArray();
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j <= i + 2 && j < v.length; j++) {
                if (v[j] == v[i]) {
                    int lt = i, rt = j;
                    while (lt >= 0 && rt < v.length && v[lt] == v[rt]) {
                        lt--;
                        rt++;
                    }
                    if (rt - lt - 2 >= r - l) {
                        l = lt + 1;
                        r = rt;
                    }
                }
            }
        }
        return s.substring(l, r);
    }

    public static void main(String[] args) {
        _5_Longest_Palindromic_Substring a = new _5_Longest_Palindromic_Substring();
        System.out.println(a.longestPalindrome("aaaa"));
    }
}
