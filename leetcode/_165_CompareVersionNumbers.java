/**
 * 注意 :
 * 1. point 可能不止一个
 * 2. 无效的前缀0 ( 1.1 = 1.01 )
 *
 * @author sunxiaoyang
 */

public class _165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;
        }
        while (true) {
            int x1, x2;
            int xs1 = Integer.valueOf(((x1 = version1.indexOf(".")) == -1) ? version1 : version1.substring(0, x1));
            int xs2 = Integer.valueOf(((x2 = version2.indexOf(".")) == -1) ? version2 : version2.substring(0, x2));
            if (xs1 == xs2) {
                version1 = x1 == -1 ? "0" : version1.substring(x1 + 1, version1.length());
                version2 = x2 == -1 ? "0" : version2.substring(x2 + 1, version2.length());
                if (x1 == -1 && x2 == -1) {
                    return 0;
                }
            } else {
                return xs1 > xs2 ? 1 : -1;
            }
        }
    }

    public static void main(String[] args) {
        _165_CompareVersionNumbers a = new _165_CompareVersionNumbers();
        System.out.println(a.compareVersion("1.10", "1.01"));
    }
}
