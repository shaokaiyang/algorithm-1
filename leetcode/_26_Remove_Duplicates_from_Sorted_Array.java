/**
 * Notes:
 * [1,1,1]
 *
 * @author sunxiaoyang
 */
public class _26_Remove_Duplicates_from_Sorted_Array {
    // 2016-03-20
    public int removeDuplicates_1(int[] nums) {
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

    // 2017-03-16 two pointer
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int first = 0, last = 1;
        for (; last < nums.length; last++) {
            if (nums[first] != nums[last]) {
                first++;
                nums[first] = nums[last];
            }
        }
        return first + 1;
    }

    public static void main(String[] args) {
        _26_Remove_Duplicates_from_Sorted_Array a = new _26_Remove_Duplicates_from_Sorted_Array();
        int[] in = {1, 1, 2};
        System.out.println(a.removeDuplicates(in));
    }
}
