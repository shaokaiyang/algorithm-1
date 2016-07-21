import java.util.Arrays;

/**
 * @author sunxiaoyang
 */
public class _16_3Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int close = nums[0] + nums[1] + nums[2];

        for (int i = 1; i < nums.length - 1; i++) {
            int l = 0;
            int r = nums.length - 1;
            while (l < i && i < r) {
                int temp = nums[l] + nums[i] + nums[r];
                if (Math.abs(close - target) > Math.abs(temp - target)) close = temp;

                if (close == target) {
                    return close;
                } else if (temp > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return close;
    }

    public static void main(String[] args) {
        _16_3Sum_Closest a = new _16_3Sum_Closest();
        int[] in = {1, 1, 1, 0};
        System.out.println(a.threeSumClosest(in, 100));
    }
}

