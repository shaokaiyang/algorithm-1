/**
 * Notes:
 * 注意整数越界 Integer.toBinaryString(Integer.valueOf(a, 2) + Integer.valueOf(b, 2));
 *
 * @author sunxiaoyang
 */
public class _67_Add_Binary {
    public String addBinary(String a, String b) {
        int la = a.length(), lb = b.length();
        char[] aa = a.toCharArray(), ba = b.toCharArray();
        int[] re = la > lb ? new int[la + 1] : new int[lb + 1];

        for (int r = re.length - 1, i = aa.length - 1, j = ba.length - 1; i >= 0 || j >= 0; i--, j--, r--) {
            re[r] += i >= 0 ? aa[i] - '0' : 0;
            re[r] += j >= 0 ? ba[j] - '0' : 0;
        }

        for (int r = re.length - 1; r >= 1; r--) {
            re[r - 1] += re[r] / 2;
            re[r] %= 2;
        }

        StringBuffer result = new StringBuffer();
        if (re[0] != 0) result.append(re[0]);
        for (int i = 1; i < re.length; i++) {
            result.append(re[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        _67_Add_Binary a = new _67_Add_Binary();
        System.out.println(a.addBinary("101", "1"));
    }
}
