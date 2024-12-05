/*
 * There are given n ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. We need to connect the ropes with minimum cost
 */

import java.util.PriorityQueue;

public class Question2 {
    public static void main(String[] args) {

        int arr[]= {4, 3, 2, 6};

        System.out.println(minCost(arr));

    }

   static int minCost(int[] arr) {
        
        int n= arr.length;
        
        PriorityQueue<Integer> minnHeap = new PriorityQueue<>();

        int cost = 0;
    
        for(int i =0;i<n;i++){
            minnHeap.add(arr[i]);
        }

        while (minnHeap.size()>=2) {
            int first = minnHeap.peek();
            minnHeap.remove();
            int second = minnHeap.peek();
            minnHeap.remove();

            int sum = first+second;

            cost += sum;

            minnHeap.add(sum);
        }



        return cost;
    }
    
}
