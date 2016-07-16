import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) return null;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = nums.length - 1; j > i && nums[j] >= 0; j--) {
                if (j < nums.length - 1 && nums[j] == nums[j + 1]) continue;
                if (Arrays.binarySearch(nums, i + 1, j, (0 - nums[i] - nums[j])) >= 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(0 - nums[i] - nums[j]);
                    l.add(nums[j]);
                    res.add(l);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _15_3Sum a = new _15_3Sum();
        int[] in = {0,0,0};
        System.out.println(a.threeSum(in));
    }
}
