import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    
    int vertices;
    int [][] matrix;

    AdjacencyMatrix(int vertices){
        this.vertices=vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdgeInMatrix(int source,int destination){
        matrix[source][destination]=1;
        // matrix[destination][source]=1;   //not for directed graph

    }

    void deleteEdgeinMatrix(int source,int destination){
        matrix[source][destination]=0;
        matrix[destination][source]=0; 
    }

    void displayGraph(){
      System.out.println("Adjacency Matrix: ");
      for(int []row:matrix){
        System.out.println(Arrays.toString(row));
      }   
    }
    public static void main(String[] args) {
     
        AdjacencyMatrix matrix = new AdjacencyMatrix(3);

        matrix.addEdgeInMatrix(0, 1);
        matrix.addEdgeInMatrix(0, 2);
        matrix.addEdgeInMatrix(2, 1);
       

        matrix.displayGraph();

  
    }
    
}
