/**
 * Notes:
 * [1,1,1]
 *
 * @author sunxiaoyang
 */
public class _26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - count; i++) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < nums.length - count - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                count++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        _26_Remove_Duplicates_from_Sorted_Array a = new _26_Remove_Duplicates_from_Sorted_Array();
        int[] in = {1, 1, 2};
        System.out.println(a.removeDuplicates(in));
    }
}
