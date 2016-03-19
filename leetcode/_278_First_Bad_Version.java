/**
 * Notes:
 * 求平均值的越界问题
 *
 * @author sunxiaoyang
 */
public class _278_First_Bad_Version {

    public int firstBadVersion(int n) {
        int f = 1, l = n;
        if (isBadVersion(f)) return f;
        while (f + 1 < l) {
            int m = f + (l - f) / 2;
            if (isBadVersion(m)) {
                l = m;
            } else {
                f = m;
            }
        }
        return isBadVersion(f) ? f : l;
    }

    // no use
    boolean isBadVersion(int version) {
        return true;
    }
}
