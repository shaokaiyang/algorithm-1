import java.util.*;

/**
 * @author sunxiaoyang
 */
public class _39_Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) continue;

            List<List<Integer>> temp = null;
            if (candidates[i] < target) {
                temp = combinationSum(candidates, target - candidates[i]);
            } else if (candidates[i] == target) {
                temp = new ArrayList<>();
                List<Integer> l = new ArrayList<>();
                temp.add(l);
            }
            if (temp != null)
                for (List<Integer> l : temp) {
                    l.add(candidates[i]);
                    Collections.sort(l);
                    if (!res.contains(l))
                        res.add(l);
                }
            else
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        _39_Combination_Sum a = new _39_Combination_Sum();
        int[] in = {92, 71, 89, 74, 102, 91, 70, 119, 86, 116, 114, 106, 80, 81, 115, 99, 117, 93, 76, 77, 111, 110, 75, 104, 95, 112, 94, 73};
        for (List<Integer> i : a.combinationSum(in, 310)) {
            for (Integer j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
