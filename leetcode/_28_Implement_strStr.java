/**
 * Note:
 * strStr("", "") = 0
 *
 * @author sunxiaoyang
 */
public class _28_Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.isEmpty()) {
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        _28_Implement_strStr a = new _28_Implement_strStr();
        System.out.println(a.strStr("213", "1"));
    }
}
