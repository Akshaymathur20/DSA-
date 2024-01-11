import java.util.PriorityQueue;


public class KSortedArray {
    public static void main(String[] args){
        int arr[]= {6,5,3,2,8,10,9};
        int k = 3;

         PriorityQueue<Integer> minHeap = new PriorityQueue<>();



        for(int i =0;i<=k;i++){
            minHeap.add(arr[i]);
        }

        for(int i=k+1;i<arr.length;i++){
            System.out.println(minHeap.remove());
            minHeap.add(arr[i]);
        }
        
        while(minHeap.size()>0){
            System.out.println(minHeap.remove());
        }

        System.out.println(KsortedArray(arr,k));
    }

    static int KsortedArray(int arr[], int k) {
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();



        for(int i =0;i<=k;i++){
            minHeap.add(arr[i]);
        }

        for(int i=k+1;i<n;i++){
            // System.out.println(minHeap.remove());
            minHeap.remove();
            minHeap.add(arr[i]);
        }

        while(minHeap.size()>0){
            // System.out.println(minHeap.remove());
            minHeap.remove();
        }
        return minHeap.element();
    }
    
}
