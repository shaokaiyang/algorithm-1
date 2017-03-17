/**
 * Note:
 * strStr("", "") = 0
 *
 * @author sunxiaoyang
 */
public class _28_Implement_strStr {
    // 2017-03-17 [sunday algorithm]
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || needle.length() > haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); ) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                     /*
                        haystack: abcdefg
                        needle:   acd
                        从左向右匹配, 当b和c不一致时, 判断d在needle中最右边出现的位置:
                          |- 若未在needle出现, 则haystack的比对下标i 移至d之后的元素
                          |- 若在needle中出现, 则haystack的比对下标i 移至使d可以对其的位置
                      */
                    int k = i + needle.length();
                    if (k >= haystack.length()) return -1;
                    int p = needle.lastIndexOf(haystack.charAt(k));
                    i = (p == -1) ? k + 1 : i + needle.length() - p;
                    break;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _28_Implement_strStr a = new _28_Implement_strStr();
        System.out.println(a.strStr("213", "4"));
    }
}
