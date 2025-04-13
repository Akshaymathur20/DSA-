import java.util.*;

public class StepsKnight {


    private int vertices;
    static int [][] matrix;

    StepsKnight(int vertices){
        this.vertices=vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdgeInMatrix(int source,int destination){
        matrix[source][destination]=1;
        // matrix[destination][source]=1;   //not for directed graph

    }
    static int knight(int source,int destination,int vertices){
         Queue<Integer> q = new LinkedList<>();
         boolean vis[]= new boolean[vertices+1];

         vis[source]=true;
         q.add(source);
         int count =0;

         while (!q.isEmpty()) {
            int top = q.poll();

           for(int neighbour[]:matrix){
            if(top==destination){
                count++;
            }
           }
        
           
        }
        return count;

    }

    void displayGraph(){
      System.out.println("Adjacency Matrix: ");
      for(int []row:matrix){
        System.out.println(Arrays.toString(row));
      }   
    }
    public static void main(String[] args) {

        int n=6;

        // int matrix[][] = new int[6][6];
     
    //    StepsKnight s = new StepsKnight(3);

        // s.addEdgeInMatrix(4, 5);
        // s.addEdgeInMatrix(1, 1);
        // // matrix.addEdgeInMatrix(2, 1);

        knight(4, 5, 2);
       

        // s.displayGraph();

  
    }
    
}
