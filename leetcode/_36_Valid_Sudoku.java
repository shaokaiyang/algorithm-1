/**
 * @author sunxiaoyang
 */
public class _36_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        // row
        for (int i = 0; i < 9; i++) {
            int[] r = new int[10];
            for (int j : board[i]) {
                if (j != '.') {
                    r[j - '0']++;
                }
            }
            for (int j : r) {
                if (j > 1) return false;
            }
        }

        // column
        for (int i = 0; i < 9; i++) {
            int[] r = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    r[board[j][i] - '0']++;
                }
            }
            for (int j : r) {
                if (j > 1) return false;
            }
        }

        // square
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] r = new int[10];
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (board[3 * i + x][3 * j + y] != '.') {
                            r[board[3 * i + x][3 * j + y] - '0']++;
                        }
                    }
                }
                for (int x : r) {
                    if (x > 1) return false;
                }
            }
        }

        return true;
    }

}
