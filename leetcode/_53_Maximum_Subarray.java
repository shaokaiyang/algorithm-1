/**
 * @author sunxiaoyang
 */
public class _53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if (nums.length <= 0) return 0;
        int res = nums[0], cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            res = Math.max(res, cur);
        }
        return res;
    }

    public static void main(String[] args) {
        _53_Maximum_Subarray a = new _53_Maximum_Subarray();
        int[] in = {100, -10};
        System.out.println(a.maxSubArray(in));
    }
}
