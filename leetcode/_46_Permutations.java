import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, nums.length - 1, res);
        return res;
    }

    public void permute(int[] nums, int start, int end, List<List<Integer>> res) {
        if (start > end) {
            List<Integer> l = new ArrayList<>();
            for (int i : nums) l.add(i);
            res.add(l);
        } else {
            for (int i = start; i <= end; i++) {
                swap(nums, start, i);
                permute(nums, start + 1, end, res);
                swap(nums, start, i);
            }
        }
    }

    public void swap(int[] in, int i, int j) {
        int temp = in[i];
        in[i] = in[j];
        in[j] = temp;
    }

    public static void main(String[] args) {
        _46_Permutations a = new _46_Permutations();
        int[] in = {3, 3, 1, 2, 3, 2, 3, 1};
        System.out.println(a.permute(in).toString());
    }
}
