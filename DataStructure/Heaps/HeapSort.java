import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class HeapSort {
    public static void main(String[] args) {
        
        int arr[]={2,6,1,5,3,4};
        System.out.println("Original Array "+ Arrays.toString(arr));
        asssort(arr);
        System.out.println();
        dessort(arr);
    }

    static void asssort(int arr[]){

        int n= arr.length;
         PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //--> Sorting array in ascending order

         for(int i =0;i<n;i++){
            minHeap.add(arr[i]);

         }

         while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
         }

       
    }

    static void dessort(int arr[]){
        int n= arr.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //--> for descending order

        for(int i =0;i<n;i++){
            maxHeap.add(arr[i]);
        }

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll()+ " ");
        }
    }
    
}
