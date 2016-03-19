/**
 * Notes:
 * [8,1,1,1,2,7,4,3,1,1]
 * [1,4,4,2,4]
 *
 * @author sunxiaoyang
 */
public class _287_Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int min = 1, max = nums.length - 1;

        while (min < max) {
            int mid = (min + max) / 2;
            int count = 0;
            for (int i : nums) {
                count += i >= min && i <= max && i > mid ? 1 : 0;
            }
            if (count > (max - min + 1) / 2) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _287_Find_the_Duplicate_Number a = new _287_Find_the_Duplicate_Number();
        int[] in = {8, 1, 1, 1, 2, 7, 4, 3, 1, 1};
//        int[] in = {1, 4, 4, 2, 4};
        System.out.println(a.findDuplicate(in));
    }
}
