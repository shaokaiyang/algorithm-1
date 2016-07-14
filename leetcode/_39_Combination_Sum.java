import java.util.*;

/**
 * @author sunxiaoyang
 */
public class _39_Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i : candidates) {
            if (i < target) {
                List<List<Integer>> temp = combinationSum(candidates, target - i);
                for (List<Integer> l : temp) {
                    l.add(i);
                    Collections.sort(l);
                    if (!res.contains(l))
                        res.add(l);
                }
            } else if (i == target) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                res.add(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _39_Combination_Sum a = new _39_Combination_Sum();

    }
}
