public class G4_FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int inital = image[sr][sc];
        int[][] ans = image;
        int delRow[] = { -1, 0, 1, 0 };
        int delCol[] = { 0, 1, 0, -1 };
        dfs(sr, sc, ans, image, newColor, inital, delRow, delCol);
        return ans;
    }

    public static void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int iniColor, int delRow[],
            int[] delCol) {

        ans[row][col] = newColor;
        int n = image.length; // row length
        int m = image[0].length; // column length;

        for (int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int nCol = col + delCol[i];

            if (nrow >= 0 && nrow < n && nCol >= 0 && nCol < m && image[nrow][nCol] == iniColor
                    && ans[nrow][nCol] != newColor) {
                dfs(nrow, nCol, ans, image, newColor, iniColor, delRow, delCol);
            }
        }

    }

    public static void bfs() {

    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 1 }, { 2, 2, 0 }, { 2, 2, 2 } };
        int sr = 2, sc = 0;
        int newColor = 4;
        printGrid(image);

        int[][] ans = floodFill(image, sr, sc, newColor);
        System.out.println("After Flood Fill ALGO : ");
        printGrid(ans);
    }
}
