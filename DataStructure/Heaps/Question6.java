import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Question6 {

    public static void main(String[] args) {

        int nums[]={1,1,1,2,2,3};
        int k = 2;

        System.out.println(topKFrequent(nums, k));
        
    }

    static int[] topKFrequent(int[] nums, int k) {

        
        int n= nums.length;

        int [] ans = new int[n];

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }


        for(int i =0;i<k;i++){
            ans[i] = minHeap.poll().getKey();
        }
        return ans;

       
       
       
   }
    
}
