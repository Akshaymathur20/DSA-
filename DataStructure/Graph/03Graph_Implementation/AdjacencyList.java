import java.util.ArrayList;
import java.util.List;
public class AdjacencyList {

    List<List<Integer>> adjList;
    int vertices;


    AdjacencyList(int vertices){
        this.vertices= vertices;
        adjList = new ArrayList<>();
        for(int i =0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdgeInList(int source,int destination){
        adjList.get(source).add(destination);
        // adjList.get(destination).add(source);   //Remove for a directed graph

    }
    void deleteEdgeinList(int source,int destination){
        adjList.get(source).remove(destination);
    }

    void printList(){
        System.out.println("Adjacency List: ");
        for(int i=0;i<adjList.size();i++){
            System.out.print(i+ " -> ");
            for(int neighbor:adjList.get(i)){
                System.out.print(neighbor+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         AdjacencyList adjList= new AdjacencyList(3);
         adjList.addEdgeInList(0, 1);
         adjList.addEdgeInList(0, 2);
         adjList.addEdgeInList(2, 1);

         adjList.printList();
    }

    
}
