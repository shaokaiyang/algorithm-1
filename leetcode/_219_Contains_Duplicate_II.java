import java.util.HashMap;

/**
 * @author sunxiaoyang
 */
public class _219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) return false;
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.containsKey(nums[i]) && i - s.get(nums[i]) <= k) {
                return true;
            }
            s.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        _219_Contains_Duplicate_II a = new _219_Contains_Duplicate_II();
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 2};
        System.out.println(a.containsNearbyDuplicate(in, 3));
    }
}
