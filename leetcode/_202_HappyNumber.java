import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */

public class _202_HappyNumber {

    public int squaresOfDigits(int n) {
        int result = 0, temp = n;
        while (temp != 0) {
            result += (temp % 10) * (temp % 10);
            temp /= 10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        List v = new ArrayList();
        int temp = n;
        while (true) {
            temp = squaresOfDigits(temp);
            if (temp == 1) {
                return true;
            }
            if (v.contains(temp)) {
                return false;
            } else {
                v.add(temp);
            }
        }
    }

    public static void main(String[] args) {
        _202_HappyNumber a = new _202_HappyNumber();
        System.out.println(a.isHappy(4));
    }
}
