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

    public int myAtoi(String str) {
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

    public static void main(String[] args) {
        _8_StringtoInteger a = new _8_StringtoInteger();
        System.out.println(a.myAtoi("2147483648"));
    }

}
