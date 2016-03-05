/**
 * Notes:
 * [4,4,1,4]
 * [1,2,1]
 * [0,0,1,1,2,0]
 *
 * @author sunxiaoyang
 */
public class _154_Find_Minimum_in_Rotated_Sorted_Array_II {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        if (l >= r || nums[l] < nums[r]) {
            return nums[l];
        }

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[l] <= nums[r]) {
                r--;
            } else if (nums[l] < nums[m]) {
                l = m;
            } else if (nums[l] > nums[m]) {
                r = m;
            } else if (l == m) {
                return nums[l] > nums[r] ? nums[r] : nums[l];
            } else {
                l++;
            }
        }
        return nums[l] > nums[r] ? nums[r] : nums[l];
    }

    public static void main(String[] args) {
        _154_Find_Minimum_in_Rotated_Sorted_Array_II a = new _154_Find_Minimum_in_Rotated_Sorted_Array_II();
//        int[] in = {4, 4, 1, 4};
//        int[] in = {1, 2, 1};
        int[] in = {0, 0, 1, 1, 2, 0};
        System.out.println(a.findMin(in));
    }
}
