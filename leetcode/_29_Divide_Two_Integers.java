/**
 * @author sunxiaoyang
 *         <p>
 *         Tips:
 *         简单的思想：先对正负号进行处理，然后被除数循环减去除数，记录次数，时间复杂度O(n)
 *         改进：利用 num = a1 * 2^k + a2 * 2^(k-1) + a3 * 2^(k-2) + ... + an
 *         将 dividend / divisor = quotient + remainder
 *         》 dividend = quotient * divisor + remainder
 *         》 dividend = ( a1 * 2^k + a2 * 2^(k-1) + a3 * 2^(k-2) + ... + an ) * divisor + remainder
 *         》 dividend = a1 * (divisor*2^k) + a2 * (divisor*2^(k-1)) + ... + an * divisor + remainder
 *         》 利用简单思想，利用减法依次求出 a1 a2 ... an，然后将它们以2的不同幂进行相加
 */
public class _29_Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == 0) return 0;

        long res = 0;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        long flag = (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) ? -1 : 1;

        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long i = 1;
            while ((temp <<= 1) <= ldividend)
                i <<= 1;
            ldividend -= temp >> 1;
            res += i;
        }

        res *= flag;
        return res >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
    }

    public static void main(String[] args) {
        _29_Divide_Two_Integers a = new _29_Divide_Two_Integers();
        System.out.println(a.divide(2147483647, 3));
        System.out.println(a.divide(1, 1));
    }
}
