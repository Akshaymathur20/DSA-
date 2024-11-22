/*
 * n choclates bags each having arr[i] scholates kid secltect the bad with max no. of chocoalte eats is
 * magicial fill the bag again by aarr[i]/2 cholocates find the no of chcolates kid can at in the k steps
 */

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Question1 {
    public static void main(String[] args) {
        int arr[]={10,3,15,8,4};

        int k = 4;

        System.out.println(solve(arr, k));
    }


    static int solve(int arr[],int k){

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int totalChocolates =0;

        for(int i=0;i<arr.length;i++){
            maxheap.add(arr[i]);
        }

        //performeing k steps

        for(int i=0;i<k;i++){
            int maxx = maxheap.poll();
            totalChocolates+= maxx;
            maxheap.add(maxx/2);
             
        }
        return totalChocolates;
    }


/// TC (nlogn) n==> size of the array
/// k steps O(klogn)(each poll and add is O(log n))
/// total O((n+k)logn)
/// space complexity--> O(n)
/// 


static int solve1(int arr[],int k){
    int totalChocolates =0;
    for(int i =0;i<k;i++){
        int maxx = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]>arr[maxx]){
                maxx=i;
            }
        }
        totalChocolates += arr[maxx];
        arr[maxx] /=2;
    }
    return totalChocolates;
  }

  //tc (o(n)) k steps --> O(k*n);
  //sc =(O(1))

  //good for small arrays for largeter array or performce maxHeap better
}