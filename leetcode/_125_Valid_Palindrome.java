/**
 * @author sunxiaoyang
 */
public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s.toLowerCase().replaceAll("[^a-z0-9]", ""));
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        _125_Valid_Palindrome a = new _125_Valid_Palindrome();
        System.out.println(a.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
