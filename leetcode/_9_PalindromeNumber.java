/**
 * @author sunxiaoyang
 */
public class _9_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String xstr = String.valueOf(x);
            return new StringBuffer(xstr).reverse().toString().equals(xstr);
        }
    }

    public static void main(String[] args) {
        _9_PalindromeNumber a = new _9_PalindromeNumber();
        System.out.println(a.isPalindrome(0));
    }
}
