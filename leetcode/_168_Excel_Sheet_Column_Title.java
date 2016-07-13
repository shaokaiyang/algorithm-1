/**
 * @author sunxiaoyang
 */
public class _168_Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        if (n <= 0) return null;

        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append((char) ((n - 1) % 26 + 65));
            n = (n - 1) / 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        _168_Excel_Sheet_Column_Title a = new _168_Excel_Sheet_Column_Title();
        System.out.println(a.convertToTitle(26));
    }
}
