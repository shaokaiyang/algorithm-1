/**
 * @author sunxiaoyang
 */
public class _258_Add_Digits {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return num - 9 * Math.floorDiv(num - 1, 9);
    }
}
