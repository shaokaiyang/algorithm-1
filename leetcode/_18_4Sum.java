import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; ) {
            for (int j = i + 1; j < nums.length; ) {
                int l = j + 1;
                int r = nums.length - 1;
                while (l < nums.length && l < r) {
                    int temp = nums[i] + nums[j] + nums[l] + nums[r];
                    if (temp < target)
                        l++;
                    else if (temp > target)
                        r--;
                    else {
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[l]);
                        t.add(nums[r]);
                        res.add(t);
                        do l++; while (l < nums.length && nums[l] == nums[l - 1]);
                    }
                }
                do j++; while (j < nums.length && nums[j] == nums[j - 1]);
            }
            do i++; while (i < nums.length && nums[i] == nums[i - 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        _18_4Sum a = new _18_4Sum();
        int[] in = {-5, 5, 4, -3, 0, 0, 4, -2};
        System.out.println(a.fourSum(in, 4));
    }

}
