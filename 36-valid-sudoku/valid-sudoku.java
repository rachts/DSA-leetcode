class Solution {
    public boolean isValidSudoku(char[][] board) {
  boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] cubs = new boolean[9][9];

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] == '.') continue;
                int n = board[i][j] - '1';
                if (rows[i][n] || cols[j][n] || cubs[cubeId(i,j)][n]) return false;
                rows[i][n] = true;
                cols[j][n] = true;
                cubs[cubeId(i,j)][n] = true;
            }
        }

        return true;
    }

    private int cubeId(int i, int j) {
        return (i/3)*3 + (j/3);
    }
}