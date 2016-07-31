/**
 * @author sunxiaoyang
 */
public class _55_Jump_Game {
    public boolean canJump(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        flag[nums.length - 1] = true;
        for (int minp = nums.length - 1, i = minp - 1; i >= 0; i--) {
            if (i + nums[i] >= minp) {
                flag[i] = true;
                minp = i;
            }
        }
        return flag[0];
    }

    public static void main(String[] args) {
        _55_Jump_Game a = new _55_Jump_Game();
        int[] in = {3, 2, 1, 0, 4};
        System.out.println(a.canJump(in));
    }
}

