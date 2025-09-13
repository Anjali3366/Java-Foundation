// Representation of Graph using Adjacency matrix !
public class G0_Basic {
    public static void addEdge(int[][] mat, int a, int b) {
        mat[a][b] = 1;
        mat[b][a] = 1;
    }

    public static void printGraphs(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello , Let's start Graphs ! ");
        int n = 5; // no of nodes / vertices
        int[][] mat = new int[n + 1][n + 1];

        // for adding any edge and node
        // mat[i][j] =1;
        // mat[j][i] = 1
        // let's assume we have these pair {(0,1) (0,2 ) (1,2) (2,5) (3,2) (4,5) (3,4)
        // for undirected graph .

        // addEdge function add the edge in the matrix
        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 5);
        addEdge(mat, 3, 2);
        addEdge(mat, 4, 5);
        addEdge(mat, 3, 4);

        // print function for displaying the whole graph in matrix -- printGraph

        printGraphs(mat);

    }

}
