/**
 * Notes：
 * ([1],1) = [0,0]
 * ([1,4],4) = [1,1]
 *
 * @author sunxiaoyang
 */
public class _34_Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        // target not in nums
        if (l > r || nums[l] > target || nums[r] < target) {
            return new int[]{-1, -1};
        }

        if (l == r) {
            return nums[l] == target ? new int[]{0, 0} : new int[]{-1, -1};
        }

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                while (m >= 0 && nums[m] == target) {
                    m--;
                }
                l = ++m;
                while (m <= nums.length - 1 && nums[m] == target) {
                    m++;
                }
                r = --m;
                return new int[]{l, r};
            }
        }

        // no nums || target not in nums
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        _34_Search_for_a_Range a = new _34_Search_for_a_Range();
        int[] in = {1, 5};
        for (int i : a.searchRange(in, 5)) {
            System.out.print(i + " ");
        }
    }
}
