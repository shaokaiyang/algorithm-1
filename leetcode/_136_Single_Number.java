/**
 * Created by sunxiaoyang on 3/18/17.
 */
public class _136_Single_Number {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
