/**
 * @author sunxiaoyang
 */
public class _172_Factorial_Trailing_Zeroes {

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n >= 5) {
            sum += n /= 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        _172_Factorial_Trailing_Zeroes a = new _172_Factorial_Trailing_Zeroes();
        System.out.println(a.trailingZeroes(15));
    }
}
