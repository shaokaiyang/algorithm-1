/**
 * @author sunxiaoyang
 */
public class _66_Plus_One {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;

        for (int i = digits.length - 1; i > 0; i--) {
            digits[i - 1] += digits[i] / 10;
            digits[i] %= 10;
        }

        if (digits[0] > 9) {
            int[] result = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            result[0] = result[1] / 10;
            result[1] %= 10;
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        _66_Plus_One a = new _66_Plus_One();
        int[] in = {9, 9, 9};
        for (int i : a.plusOne(in)) {
            System.out.print(i + " ");
        }

    }
}
