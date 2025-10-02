import java.util.*;
import java.util.LinkedList;

public class G10_Bipartite {

    public static boolean bipartite(ArrayList<ArrayList<Integer>> graph, int V) {
        int[] color = new int[V];

        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (check(graph, color, i) == false)
                    return false;
            }
        }
        return true;
    }

    public static boolean check(ArrayList<ArrayList<Integer>> graph, int[] color, int start) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();

            for (int it : graph.get(node)) {
                if (color[it] == -1) {
                    color[it] = 1 - color[node];
                    q.offer(it);
                } else if (color[it] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
