import java.util.Arrays;

/**
 * @author sunxiaoyang
 *         <p>
 *         Tips:
 *         逆序查找满足 nums[e]> nums[e-1]
 *         在 nums[e]...nums[END] 中 大于nums[e-1]的最小数 并与 nums[e-1] 互换
 *         将 nums[e]...nums[END] 升序排序
 */
public class _31_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int e = nums.length - 1;
        while (e > 0 && nums[e] <= nums[e - 1]) e--;
        if (e > 0) {
            int t = e;
            for (int i = e; i < nums.length; i++)
                if (nums[i] < nums[t] && nums[i] > nums[e - 1]) t = i;
            int temp = nums[t];
            nums[t] = nums[e - 1];
            nums[e - 1] = temp;
        }
        Arrays.sort(nums, e, nums.length);
    }

    public static void main(String[] args) {
        _31_Next_Permutation a = new _31_Next_Permutation();
        int[] in = {2, 3, 1};
        a.nextPermutation(in);
        System.out.println(Arrays.toString(in));
    }
}
