/**
 * @author sunxiaoyang
 */

public class _58_LengthofLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        String[] t = s.split(" ");
        if (t.length < 1) {
            return 0;
        } else {
            return t[t.length - 1].length();
        }
    }
}
