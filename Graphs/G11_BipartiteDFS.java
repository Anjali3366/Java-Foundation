import java.util.*;

public class G11_BipartiteDFS {

    public static boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> graph) {
        color[node] = col;

        for (int it : graph.get(node)) {
            if (color[it] == -1) {
                if (dfs(it, 1 - col, color, graph) == false)
                    return false;
            } else if (color[it] == color[node])
                return false;
        }

        return true;
    }

    public static boolean bipartite(int V, ArrayList<ArrayList<Integer>> graph) {

        int[] color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {

                if (dfs(i, 0, color, graph) == false)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
