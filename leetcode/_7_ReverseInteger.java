package leetcode;

/**
 * <p>
 * 1. 获取整数的符号
 * 2. 将整数转为字符串
 * 3. 将字符串翻转后转为整数
 * 4. 若越界则返回0，否则返回带有符号的整数
 * </p>
 *
 * @author sunxiaoyang
 */

public class _7_ReverseInteger {
    public int reverse(int x) {
        int flag = x < 0 ? -1 : 1;
        Integer xi = Integer.valueOf(x * flag), xire;
        try {
            xire = new Integer(new StringBuffer(xi.toString()).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return xire.intValue() * flag;
    }

//	public static void main(String[] args) {
//		_7_ReverseInteger a = new _7_ReverseInteger();
//		System.out.println( a.reverse(1534236469));
//	}
}
