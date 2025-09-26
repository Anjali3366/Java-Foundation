public class G8_SurroundXO {

    public static char[][] fill(int n, int m, char[][] mat) {
        int vis[][] = new int[n][m];

        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };

        // traverse the first row and last row
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 'O' && vis[0][j] == 0) {
                dfs(0, j, vis, mat, dx, dy);
            }
            if (mat[n - 1][j] == 'O' && vis[n - 1][j] == 0) {
                dfs(n - 1, j, vis, mat, dx, dy);
            }
        }
        // traverse first col and last col;
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 'O' && vis[i][0] == 0) {
                dfs(i, 0, vis, mat, dx, dy);
            }
            if (mat[i][m - 1] == 'O' && vis[i][m - 1] == 0) {
                dfs(i, m - 1, vis, mat, dx, dy);
            }
        }

        // fill other O's into X's in the matrix

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 'O' && vis[i][j] == 0) {
                    mat[i][j] = 'X';
                }
            }
        }

        return mat;

    }

    public static void dfs(int row, int col, int[][] vis, char[][] mat, int[] dx, int[] dy) {
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;

        // check 4 direction
        for (int i = 0; i < 4; i++) {
            int nrow = row + dx[i];
            int ncol = col + dy[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
                dfs(nrow, ncol, vis, mat, dx, dy);
            }
        }
    }

    public static void printmatrix(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] mat = {
                { 'X', 'X', 'X', 'X' },
                { 'X', 'O', 'O', 'X' },
                { 'X', 'X', 'O', 'X' },
                { 'X', 'O', 'X', 'X' }
        };
        int n = mat.length, m = mat[0].length;

        char[][] res = fill(n, m, mat);
        printmatrix(res);
    }

}
