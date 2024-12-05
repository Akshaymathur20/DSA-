/*
 * Sum of elements between k1'th and k2'th smallest elements
Difficulty: EasyAccuracy: 32.02%Submissions: 45K+Points: 2
Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).
 */

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Question3 {

    public static void main(String[] args) {
        int arr[]={1,3,12,5,15,11};
        int K1 = 3;
        int K2 = 6;

        System.out.println(solve(arr, arr.length, K1, K2));
        // // System.out.println();
        // System.out.println(KthSmallestElement(arr, arr.length,K1));
        // System.out.println(KthSmallestElement(arr, arr.length,K2));
    }

    static int solve(int arr[],int n, int K1, int K2){

       
        int first= KthSmallestElement(arr, n, K1);     //5
        int second= KthSmallestElement(arr, n, K2);   //15


        int sum =0;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>first && arr[i]<second){
                    sum += arr[i];
            }
        
        }
        return sum;
    }
    
    private static int KthSmallestElement(int arr[],int n,int k){

        PriorityQueue<Integer> maxxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int i =0;i<n;i++){
           maxxHeap.add(arr[i]);
           while (maxxHeap.size()>k) {
                   maxxHeap.remove();
           }
       }
    

      return maxxHeap.peek();
    }
    
}
