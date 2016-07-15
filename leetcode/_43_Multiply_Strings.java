/**
 * @author sunxiaoyang
 */
public class _43_Multiply_Strings {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) return null;
        StringBuilder res = new StringBuilder();
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int len = n1.length + n2.length + 1;
        int[] product = new int[len];

        for (int i = n1.length - 1; i >= 0; i--) {
            for (int j = n2.length - 1; j >= 0; j--) {
                product[len - i - j - 2] += (n1[i] - '0') * (n2[j] - '0');
                product[len - i - j - 1] += product[len - i - j - 2] / 10;
                product[len - i - j - 2] %= 10;
            }
        }

        int i = len - 1;
        while (i > 0 && product[i] == 0) i--;
        while (i >= 0) res.append(product[i--]);

        return res.toString();
    }

    public static void main(String[] args) {
        _43_Multiply_Strings a = new _43_Multiply_Strings();
        System.out.println(a.multiply("0", "0"));
    }
}
