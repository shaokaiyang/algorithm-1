import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) return null;
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) return res;
        int n = matrix[0].length;
        if (n == 0) return res;

        int i = 0, j = 0;
        while (true) {
            res.add(matrix[i][j]);
            if ((j >= i - 1) && (i + j < n - 1) && (i <= (m - 1) / 2))
                j++;
            else if ((i + j >= n - 1) && (i + n < j + m) && (j >= n / 2))
                i++;
            else if ((j + m <= i + n) && (i + j > m - 1) && (i > (m - 1) / 2))
                j--;
            else if ((i + j <= m - 1) && (j < i - 1) && (j < n / 2))
                i--;
            else
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        _54_Spiral_Matrix a = new _54_Spiral_Matrix();
//        int[][] in = {{3}, {4}};
        int[][] in = {{2, 5}, {8, 4}, {0, -1}};
        System.out.println(a.spiralOrder(in));
    }
}
