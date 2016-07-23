/**
 * @author sunxiaoyang
 */
public class _35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    public int searchInsert(int[] nums, int target, int s, int e) {
        if (nums[s] >= target) return s;
        if (nums[e] == target) return e;
        if (nums[e] < target) return e + 1;
        if (s == e) return s;
        int m = (s + e) / 2;
        if (nums[m] == target) return m;
        if (nums[m] > target) return searchInsert(nums, target, s, m - 1);
        return searchInsert(nums, target, m + 1, e);
    }
}
