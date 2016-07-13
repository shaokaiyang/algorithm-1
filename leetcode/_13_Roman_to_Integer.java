/**
 * @author sunxiaoyang
 */
public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        if (s == null) return 0;

        char[] sa = s.toUpperCase().toCharArray();
        int res;
        res = charValue(sa[0]);
        for (int i = 1; i < sa.length; i++) {
            if (charValue(sa[i]) > charValue(sa[i - 1])) {
                res += charValue(sa[i]) - 2 * charValue(sa[i - 1]);
            } else {
                res += charValue(sa[i]);
            }
        }
        return res;
    }

    public int charValue(Character i) {
        switch (Character.toUpperCase(i)) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
