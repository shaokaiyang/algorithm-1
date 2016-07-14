import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _40_Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) continue;

            List<List<Integer>> temp = null;
            if (candidates[i] < target) {
                temp = combinationSum2(removeOneElement(candidates, candidates[i]), target - candidates[i]);
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

    public int[] removeOneElement(int[] source, int target) {
        int[] res = new int[source.length - 1];
        int i = 0, j = 0;
        boolean flag = true;
        while (i < source.length) {
            if (flag && source[i] == target) {
                flag = false;
                i++;
            } else
                res[j++] = source[i++];
        }
        return res;
    }

    public static void main(String[] args) {
        _40_Combination_Sum_II a = new _40_Combination_Sum_II();
        int[] in = new int[]{14, 22, 8, 31, 30, 26, 9, 34, 20, 13, 10, 22, 6, 12, 18, 22, 28, 19, 14, 17, 24, 24, 22, 14, 27, 30, 6, 23, 25, 14, 33, 5, 23, 7, 23, 18, 28, 20, 9, 5, 20, 14, 22, 21, 21, 6, 9, 6, 12, 10, 19, 31, 21, 28, 32, 14, 23, 33, 32, 14};
        for (List<Integer> i : a.combinationSum2(in, 29)) {
            for (Integer j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
