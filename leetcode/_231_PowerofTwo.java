/**
 * @author sunxiaoyang
 */

public class _231_PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0, t = 1; i < 31; i++) {
            if (n == t << i) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _231_PowerofTwo a = new _231_PowerofTwo();
        System.out.println(a.isPowerOfTwo(-2147483648));
    }
}
