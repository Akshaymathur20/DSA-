import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsGraph {

    List<List<Integer>> adjList;
    int vertices;

    DfsGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void dfs(int source) {
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[adjList.size()];

        vis[source] = true;
        st.add(source);

        while (!st.isEmpty()) {
            int top = st.pop();
            System.out.print(top + " ");
            for (int neighbour : adjList.get(top)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    st.add(neighbour);
                }
            }
        }
    }

    public void addEdgeInList(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Remove for a directed graph
    }

    public static void main(String[] args) {
        DfsGraph adjList = new DfsGraph(9);

        adjList.addEdgeInList(1, 2);
        adjList.addEdgeInList(1, 5);
        adjList.addEdgeInList(2, 6); 
        adjList.addEdgeInList(3, 4);
        adjList.addEdgeInList(3, 6);
        adjList.addEdgeInList(3, 7);
        adjList.addEdgeInList(4, 8);
        adjList.addEdgeInList(6, 7);
        adjList.addEdgeInList(7, 8);

        System.out.println("DFS Starting from 0: ");
        adjList.dfs(2);   
    }
}
