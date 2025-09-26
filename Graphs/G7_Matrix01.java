import java.util.*;

public class G7_Matrix01 {
    public static class Node {
        int row;
        int col;
        int st;

        public Node(int r, int c, int s) {
            this.row = r;
            this.col = c;
            this.st = s;
        }

    }

    public static int[][] updateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];
        Queue<Node> q = new LinkedList<Node>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    q.offer(new Node(i, j, 0));
                } else {
                    res[i][j] = -1;
                }
            }
        }

        int[] dx = { 0, -1, 0, 1 };
        int[] dy = { 1, 0, -1, 0 };

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int step = q.peek().st;

            q.poll();

            res[r][c] = step;
            for (int i = 0; i < 4; i++) {
                int nrow = r + dx[i];
                int ncol = c + dy[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && res[nrow][ncol] == -1) {
                    q.offer(new Node(nrow, ncol, step + 1));
                }

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        int[][] ans = updateMatrix(matrix);

        printMatrix(ans);
    }

}
