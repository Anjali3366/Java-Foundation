import java.util.*;

public class G3_DFStraversal {

    public static void traversalDFS(int node, List<Integer> dfs, boolean[] vis, List<List<Integer>> graph) {
        vis[node] = true;
        dfs.add(node);

        for (Integer it : graph.get(node)) {
            if (!vis[it]) {
                traversalDFS(it, dfs, vis, graph);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> gr = new ArrayList<>();
        int n = 4;
        boolean vis[] = new boolean[n + 1];
        vis[0] = true;
        List<Integer> dfs = new ArrayList<>();
        traversalDFS(0, dfs, vis, gr);
        System.out.println(dfs);

    }

}
