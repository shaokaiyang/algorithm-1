/**
 * @author sunxiaoyang
 */
public class _59_Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        if (n < 0) return null;
        if (n == 0) return new int[][]{};
        int[][] res = new int[n][n];
        if (n == 1) {
            res[0][0] = 1;
            return res;
        }

        int i = 0, j = 0;
        for (int v = 1; v <= n * n; v++) {
            res[i][j] = v;
            if ((j >= i - 1) && (i + j < n - 1) && (i <= (n - 1) / 2))
                j++;
            else if ((i + j >= n - 1) && (i + n < j + n) && (j >= n / 2))
                i++;
            else if ((j + n <= i + n) && (i + j > n - 1) && (i > (n - 1) / 2))
                j--;
            else if ((i + j <= n - 1) && (j < i - 1) && (j < n / 2))
                i--;
            else
                break;
        }
        return res;
    }
}
