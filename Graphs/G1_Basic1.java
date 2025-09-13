// Representation of Graphs using Adjacency List !

import java.util.*;

public class G1_Basic1 {

    public static void addEdge(List<List<Integer>> list, int a, int b) {
        list.get(a).add(b);
        list.get(b).add(a);// for undirected graphs
    }

    public static void printGraph(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Vertices your Graph have :");
        int n = sc.nextInt();
        System.out.println("Do you confirm that your graph have " + n + " Nodes (y for yes / n for no) : ");
        char ch = sc.next().charAt(0);

        if (ch == 'y') {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<Integer>());
            }
            // assume this is the hard coded graphs that user input are just for fun :)
            addEdge(graph, 0, 1);
            addEdge(graph, 0, 2);
            addEdge(graph, 1, 2);
            addEdge(graph, 2, 5);
            addEdge(graph, 3, 2);
            addEdge(graph, 4, 5);
            addEdge(graph, 3, 4);

            printGraph(graph);
            System.out.println("DONE :) ");
        } else if (ch == 'n') {
            System.out.println("Sorry for Issue ! Let's run the code Again :)");
        } else {
            System.out.println("Wrong Input ! Try Again :( ");
        }
    }
}
