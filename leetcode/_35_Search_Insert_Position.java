/**
 * @author sunxiaoyang
 */
public class _35_Search_Insert_Position {
    // 2016-07-23
    public int searchInsert_1(int[] nums, int target) {
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

    // 2017-03-18
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int l = 0, r = len - 1;
        if (nums[l] >= target) return 0;
        if (nums[r] == target) return len - 1;
        if (nums[r] < target) return len;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > target)
                r = m;
            else if (nums[m] < target)
                l = m + 1;
            else
                return m;
        }
        return l;
    }

    public static void main(String[] args) {
        _35_Search_Insert_Position a = new _35_Search_Insert_Position();
        int in[] = new int[]{1, 3, 5};
        System.out.println(a.searchInsert(in, 2));
    }
}
