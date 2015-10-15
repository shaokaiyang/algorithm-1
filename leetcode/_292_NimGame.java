/**
 * <p>
 * 数量为1-3：先手赢
 * 数量为4：后手赢
 * 数量为5-7：先手赢，拿N个将其转为数量4的情况
 * 数量为8：后手赢，与先手一起拿够4个
 * 数量为9-11：先手赢，拿N个将其转为数量8的情况
 * ……
 * </p>
 *
 * @author sunxiaoyang
 */

public class _292_NimGame {

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

}
