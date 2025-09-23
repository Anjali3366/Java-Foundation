import java.util.*;
import java.util.LinkedList;

public class G2_TraversalBFS {
    public static List<Integer> traversalBFS(ArrayList<ArrayList<Integer>> graph, int n) {
        List<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[n + 1];
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        vis[0] = true;

        while (!qu.isEmpty()) {
            Integer node = qu.poll();
            bfs.add(node);

            for (Integer it : graph.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    qu.add(it);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {

        int n = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        System.out.println(traversalBFS(graph, n));

    }

}
