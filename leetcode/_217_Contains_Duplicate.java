import java.util.HashSet;
import java.util.Set;

/**
 * @author sunxiaoyang
 */
public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }
        return s.size() != nums.length;
    }
}
