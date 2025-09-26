public class G9_NoOfEnclave {

    public static int countEnclave(int[][] mat, int n, int m) {
        int[][] vis = new int[n][m];
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        // traverse the first row and last row
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 1 && vis[0][j] == 0) {
                dfs(0, j, vis, mat, dx, dy);
            }

            if (mat[n - 1][j] == 1 && vis[n - 1][j] == 0) {
                dfs(n - 1, j, vis, mat, dx, dy);
            }
        }

        // traverse the first col and last col

        for (int i = 0; i < n; i++) {
            // first col
            if (mat[i][0] == 1 && vis[i][0] == 0) {
                dfs(i, 0, vis, mat, dx, dy);
            }
            if (mat[i][m - 1] == 1 && vis[i][m - 1] == 0) {
                dfs(i, m - 1, vis, mat, dx, dy);
            }
        }

        // count the inner one that is your ans
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && vis[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(int row, int col, int[][] vis, int[][] mat, int[] dx, int[] dy) {
        vis[row][col] = 1;

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < 4; i++) {
            int nrow = row + dx[i];
            int ncol = col + dy[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && mat[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, mat, dx, dy);
            }
        }

    }

    public static void main(String[] args) {

        int[][] mat = { { 0, 0, 0, 0 },
                { 1, 0, 1, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 0 } };
        System.out.println("No of Enclave are : " + countEnclave(mat, 4, 4));
    }

}
