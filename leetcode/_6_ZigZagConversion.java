/**
 * <p>
 * 题目意思是这样的
 * nRows = 2
 * 0 2 4 6 ...
 * 1 3 5 7
 * nRows = 3
 * 0   4   8  ...
 * 1 3 5 7 9
 * 2   6   10
 * nRows = 4
 * 0     6       12 ...
 * 1   5 7    11
 * 2 4   8 10
 * 3     9
 * </p>
 *
 * @author sunxiaoyang
 */

public class _6_ZigZagConversion {

    public String convert(String s, int numRows) {

        if (numRows < 0) return null;

        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; ; j++) {
                if (i != 0 && i != numRows - 1) {
                    if (2 * j * (numRows - 1) - i < s.length() && 2 * j * (numRows - 1) - i >= 0) {
                        result.append(s.charAt(2 * j * (numRows - 1) - i));
                    }
                }

                if (2 * j * (numRows - 1) + i < s.length() && 2 * j * (numRows - 1) + i >= 0) {
                    result.append(s.charAt(2 * j * (numRows - 1) + i));
                } else {
                    break;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        _6_ZigZagConversion a = new _6_ZigZagConversion();
        System.out.println(a.convert("ABC", 2));
    }
}
