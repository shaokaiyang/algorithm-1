/**
 * @author sunxiaoyang
 */
public class _204_Count_Primes {
    public int countPrimes(int n) {
        int[] re = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) re[i] = 1;

        for (int i = 2; i*i < n; i++) {
            if (re[i] != 0) {
                re[i] = 1;
                for (int j = i; j * i < n; j++) re[j * i] = 0;
            }
        }
        for (int i = 2; i < n; i++) result += re[i];

        return result;
    }

    public static void main(String[] args) {
        _204_Count_Primes a = new _204_Count_Primes();
        System.out.println(a.countPrimes(1500000));
    }
}
