/**
 * @author sunxiaoyang
 */

public class _14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; ; j++) {
            boolean flag = false;
            for (int i = 0; i < len; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            } else {
                result.append(strs[0].charAt(j));

            }
        }
        return result.toString();
    }

}
