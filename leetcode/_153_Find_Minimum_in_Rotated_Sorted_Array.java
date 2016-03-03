/**
 * Created by boy on 16-3-3.
 */
public class _153_Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        // no rotated
        if (nums[l] < nums[r]) {
            return nums[l];
        }

        // rotated
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[l] > nums[m]) {
                r = m;
            } else if (nums[l] < nums[m]) {
                l = m;
            } else if (nums[l] < nums[r]) {
                return nums[l];
            } else {
                return nums[r];
            }
        }

        // only one element
        return nums[0];
    }

    public static void main(String[] args) {
        _153_Find_Minimum_in_Rotated_Sorted_Array a = new _153_Find_Minimum_in_Rotated_Sorted_Array();
        int in[] = {1};
        System.out.println(a.findMin(in));
    }
}
