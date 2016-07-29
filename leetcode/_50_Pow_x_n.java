/**
 * @author sunxiaoyang
 */
public class _50_Pow_x_n {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double res = 1, temp = x;
        while (n != 1 && n != -1) {
            if (n % 2 == 1 || n % 2 == -1)
                res *= temp;
            temp *= temp;
            n /= 2;
        }
        return n == -1 ? 1 / (res * temp) : res * temp;
    }

    public static void main(String[] args) {
        _50_Pow_x_n a = new _50_Pow_x_n();
        System.out.println(a.myPow(-1, -2147483648));
    }
}
