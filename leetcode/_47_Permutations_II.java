import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _47_Permutations_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        permuteUnique(nums, 0, nums.length - 1, res);
        return res;
    }

    public void permuteUnique(int[] nums, int start, int end, List<List<Integer>> res) {
        if (start > end) {
            List<Integer> l = new ArrayList<>();
            for (int i : nums) l.add(i);
            res.add(l);
        } else {
            for (int i = start; i <= end; i++) {
                if (isIn(nums, start, i, nums[i])) continue;
                swap(nums, start, i);
                permuteUnique(nums, start + 1, end, res);
                swap(nums, start, i);
            }
        }
    }

    public void swap(int[] in, int i, int j) {
        int temp = in[i];
        in[i] = in[j];
        in[j] = temp;
    }

    public boolean isIn(int[] in, int s, int e, int t) {
        for (int i = s; i < e; i++) {
            if (in[i] == t)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _47_Permutations_II a = new _47_Permutations_II();
        int[] in = {1, 1, 2};
        System.out.println(a.permuteUnique(in));
    }
}
