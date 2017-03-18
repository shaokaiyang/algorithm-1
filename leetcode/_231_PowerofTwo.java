/**
 * 注意整数最高位为符号位，比对时最大为第31位为1
 *
 * @author sunxiaoyang
 */

public class _231_PowerofTwo {
    // 2015-10-22
    public boolean isPowerOfTwo_1(int n) {
        for (int i = 0, t = 1; i < 31; i++) {
            if (n == t << i) return true;
        }
        return false;
    }

    // 2017-03-18
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        _231_PowerofTwo a = new _231_PowerofTwo();
        System.out.println(a.isPowerOfTwo(-2147483648));
    }
}
