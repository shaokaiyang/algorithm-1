/**
 * 此题不需要额外的数组空间
 * 仅需要遍历一下原数组，将非零元素从前至后写入原数组即可
 *
 * @author sunxiaoyang
 */

public class _283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int z = 0, j = 0, l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            } else {
                z++;
            }
        }
        for (int i = l - 1; i >= 0 && z > 0; z--, i--) {
            nums[i] = 0;
        }
    }
}
