/**
 * @author sunxiaoyang
 */
public class _171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int sum = 0;
        for (char i : s.toUpperCase().toCharArray()) {
            sum = sum * 26 + (i - 'A' + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        _171_Excel_Sheet_Column_Number a = new _171_Excel_Sheet_Column_Number();
        System.out.println(a.titleToNumber("z"));
    }
}
