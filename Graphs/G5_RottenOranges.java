import java.util.*;
import java.util.LinkedList;

public class G5_RottenOranges {

    public static class Pair {
        int row;
        int cols;
        int time;

        public Pair(int r, int c, int t) {
            this.row = r;
            this.cols = c;
            this.time = t;
        }
    }

    public static int rottenOrange(int[][] oranges) {
        int n = oranges.length;
        int m = oranges[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        int countFresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (oranges[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }
                if (oranges[i][j] == 1)
                    countFresh++;
            }
        }
        int tm = 0;
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        int cnt = 0;
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().cols;
            int t = q.peek().time;
            q.poll();
            tm = Math.max(t, tm);

            for (int k = 0; k < 4; k++) {
                int nrow = r + dx[k];
                int nCol = c + dy[k];

                if (nrow >= 0 && nrow < n && nCol >= 0 && nCol < m && visited[nrow][nCol] != 2
                        && oranges[nrow][nCol] == 1) {
                    q.offer(new Pair(nrow, nCol, t + 1));
                    visited[nrow][nCol] = 2;
                    cnt++;
                }

            }

        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (visited[i][j] != 2 && oranges[i][j] == 1)
        // return -1;
        // }
        // }
        if (cnt != countFresh)
            return -1;

        return tm;
    }

    public static void main(String[] args) {
        int[][] oranges = { { 0, 1, 2 }, { 0, 1, 2 }, { 2, 1, 1 } };
        System.out.println(rottenOrange(oranges));

    }

}
