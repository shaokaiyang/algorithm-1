import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * 此题目难
 * 但面试时也是最容易出错的
 * 请注意几个问题：
 * 1. 空白字符的处理
 * 2. 正负号的处理
 * 3. 异常字符的处理
 * 4. 越界的判断和处理
 * </p>
 *
 * @author sunxiaoyang
 */

public class _8_StringtoInteger {

    // 2015-10-15
    public int myAtoi_1(String str) {
        str = str.trim();
        if (str.length() < 1) {
            return 0;
        }

        int flag = str.charAt(0) == '-' ? -1 : 1;
        int start = str.charAt(0) == '-' || str.charAt(0) == '+' ? 1 : 0;
        double result = 0;

        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result = result * 10 + (str.charAt(i) - '0');
            } else {
                break;
            }
        }

        result *= flag;

        if (result < -2147483648) {
            return -2147483648;
        } else if (result > 2147483647) {
            return 2147483647;
        } else {
            return (int) result;
        }

    }

    // 2017-03-17
    public int myAtoi(String str) {
        // null
        if (str == null) return 0;

        // remove blank characters at two sides
        str = str.trim();

        // first valid substring
        String regex = "^[-+]?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            str = matcher.group();
        else
            return 0;

        // valid substring to integer
        double result = 0;
        char fc = str.charAt(0);
        int start = (fc == '-' || fc == '+') ? 1 : 0;
        int flag = (fc == '-') ? -1 : 1;
        for (int i = start; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        result *= flag;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
            return (int) result;
    }

    public static void main(String[] args) {
        _8_StringtoInteger a = new _8_StringtoInteger();
        System.out.println(a.myAtoi("+-2"));
    }

}
