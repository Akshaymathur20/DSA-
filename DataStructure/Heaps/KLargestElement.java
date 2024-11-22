import java.util.PriorityQueue;

public class KLargestElement {
    public static void main(String[] args) {
        int arr[]= { 7,10,4,20,14};
        int k = 3;

        System.out.println(KlargestElement(arr, k));
    }

    static int KlargestElement(int arr[],int k){
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0;i<n;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }

        // return minHeap.peek();  --> it will print kth largest element in our case it is 10
        //Top three largest element in the array code

        //The code will easily remove all the smalles element in the heap and when it becomes k==3 then we will return at the end heap which stores the top three largest element in the array 
        while(minHeap.size()>0){
            System.out.println(minHeap.peek()+" ");
            minHeap.remove();
        }
        
        //It wil print the elementt which are present in the min heap;
        return minHeap.element();
    }   
}
