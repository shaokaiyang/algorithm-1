/**
 * @author sunxiaoyang
 */
public class _12_Integer_to_Roman {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int[] v = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String r[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < num / v[i]; j++) res.append(r[i]);
            num -= num / v[i] * v[i];
        }
        return res.toString();
    }
}
