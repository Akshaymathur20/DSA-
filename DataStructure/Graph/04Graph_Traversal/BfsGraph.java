import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsGraph {

    List<List<Integer>> adjList;
    int vertices;

    BfsGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void bfs(int source) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[adjList.size()];

        vis[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int neighbour : adjList.get(curr)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public void addEdgeInList(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Remove for a directed graph
    }

    public static void main(String[] args) {
        BfsGraph adjList = new BfsGraph(9);

        adjList.addEdgeInList(1, 2);
        adjList.addEdgeInList(1, 5);
        adjList.addEdgeInList(2, 6); 
        adjList.addEdgeInList(3, 4);
        adjList.addEdgeInList(3, 6);
        adjList.addEdgeInList(3, 7);
        adjList.addEdgeInList(4, 8);
        adjList.addEdgeInList(6, 7);
        adjList.addEdgeInList(7, 8);

        System.out.println("BFS Starting from 2: ");
        adjList.bfs(2); 
    }
}
