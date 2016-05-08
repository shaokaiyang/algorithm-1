import java.util.HashMap;

/**
 * @author sunxiaoyang
 *         <p>
 *         Notes: [3, 2, 4] 6 => [1, 2]
 *         </p>
 */

public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            r.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer part = r.get(target - nums[i]);
            if (part != null && part != i) {
                result[0] = i;
                result[1] = part;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _1_Two_Sum a = new _1_Two_Sum();
        int[] nums = new int[]{3, 2, 4};
        int[] b = a.twoSum(nums, 6);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}