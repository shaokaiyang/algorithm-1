/**
 * @author sunxiaoyang
 */
public class _80_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int sum = 0, temp = Integer.MIN_VALUE;
        int flag = 0;

        // compute the length of nums
        for (int i = 0; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                flag = 0;
            } else {
                flag++;
            }

            if (flag < 2) {
                sum++;
            } else {
                nums[i] = Integer.MIN_VALUE;
            }
        }

        // remove duplicates from array
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE) {
                j = i + 1;
                while (j < nums.length && nums[j] == Integer.MIN_VALUE) j++;
                if (j < nums.length) {
                    nums[i] = nums[j];
                    nums[j] = Integer.MIN_VALUE;
                }
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        _80_Remove_Duplicates_from_Sorted_Array_II a = new _80_Remove_Duplicates_from_Sorted_Array_II();
        int[] in = {1, 1, 1, 2};
        System.out.println(a.removeDuplicates(in));

    }
}
