import java.util.*;

public class G6_DetectCycle {
    // using bfs traversal and dfs traversal
    public static class Pair {
        int cf;
        int next;

        public Pair(int i, int j) {
            cf = i;
            next = j;
        }

    }

    public static boolean detectCycle(int sr, int V, ArrayList<ArrayList<Integer>> graph, boolean[] vis) {
        vis[sr] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(-1, sr));

        while (!q.isEmpty()) {
            int node = q.peek().next;
            int parent = q.peek().cf;
            q.poll();

            for (int it : graph.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(new Pair(node, it));
                } else if (parent != it) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> graph) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++)
            vis[i] = false;

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                if (detectCycle(i, V, graph, vis))
                    return true;
            }
        }
        return false;
    }

    public static boolean isCycleDFS() {

        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        // Example edges (undirected)
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(2).add(4);
        graph.get(4).add(2);
        graph.get(2).add(5);
        graph.get(5).add(2);
        graph.get(5).add(6);
        graph.get(6).add(5);

        System.out.println(isCycle(V, graph));

    }

}
