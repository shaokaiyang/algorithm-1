/**
 * Created by sunxiaoyang on 3/18/17.
 */
public class _367_Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while (l < r) {
            int m = l + (r - l) / 2;  // 整数溢出问题
            if (1.0 * m * m < num)    // 整数溢出问题
                l = m + 1;
            else
                r = m;
        }
        return l * l == num;
    }

    public static void main(String[] args) {
        _367_Valid_Perfect_Square a = new _367_Valid_Perfect_Square();
        System.out.println(a.isPerfectSquare(808201));
    }
}
