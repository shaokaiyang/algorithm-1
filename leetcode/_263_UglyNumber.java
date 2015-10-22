/**
 * 注意题目中的条件正整数，所以首先排除非正整数的情况
 *
 * @author sunxiaoyang
 */
public class _263_UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        boolean t = true;
        int[] l = {2, 3, 5};
        while (t) {
            t = false;
            for (int i = 0; i < 3; i++) {
                if (num % l[i] == 0) {
                    num /= l[i];
                    t = true;
                }
            }
        }
        return num == 1 ? true : false;
    }

    public static void main(String[] args) {
        _263_UglyNumber a = new _263_UglyNumber();
        System.out.println(a.isUgly(0));
    }

}
