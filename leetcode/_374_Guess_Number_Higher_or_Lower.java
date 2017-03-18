/**
 * Created by sunxiaoyang on 3/18/17.
 */
public class _374_Guess_Number_Higher_or_Lower {

    public int guessNumber(int n) {
        int l = 1, r = n;
        while (true) {
            int m = l + (r - l) / 2;
            int gm = guess(m);
            if (-1 == gm)
                r = m - 1;
            else if (1 == gm)
                l = m + 1;
            else
                return m;
        }
    }

    // no use
    public int guess(int num) {
        return 1;
    }

    public static void main(String[] args) {
        _374_Guess_Number_Higher_or_Lower a = new _374_Guess_Number_Higher_or_Lower();
        a.guessNumber(10);
    }
}
