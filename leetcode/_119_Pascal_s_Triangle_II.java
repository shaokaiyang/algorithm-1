import java.util.Arrays;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _119_Pascal_s_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        Integer[] res = new Integer[++rowIndex];
        if (rowIndex > 0) {
            res[0] = 1;
            for (int i = 1; i < rowIndex; i++)
                for (int j = i; j >= 1; j--)
                    res[j] = res[j - 1] + (j == i ? 0 : res[j]);
        }
        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        _119_Pascal_s_Triangle_II a = new _119_Pascal_s_Triangle_II();
        for (Integer j : a.getRow(2)) {
            System.out.print(j + " ");
        }
    }
}
