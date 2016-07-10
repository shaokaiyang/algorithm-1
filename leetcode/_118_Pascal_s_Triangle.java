import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _118_Pascal_s_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if (numRows > 0) {
            res.add(new ArrayList<>());
            res.get(0).add(1);
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> uprow = res.get(i - 1);
            for (int j = 0; j <= i; j++) {
                row.add((j == 0 ? 0 : uprow.get(j - 1)) + (j == i ? 0 : uprow.get(j)));
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        _118_Pascal_s_Triangle a = new _118_Pascal_s_Triangle();
        for (List<Integer> i : a.generate(0)) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
