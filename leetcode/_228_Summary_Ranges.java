import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _228_Summary_Ranges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int j;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while (j < nums.length && nums[j - 1] + 1 == nums[j]) {
                j++;
            }

            if (j == i + 1) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[i] + "->" + nums[j - 1]);
                i = j - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _228_Summary_Ranges a = new _228_Summary_Ranges();
        int[] in = new int[]{0, 2, 4, 6, 7};
        for (String i : a.summaryRanges(in)) {
            System.out.println(i);
        }

    }
}
