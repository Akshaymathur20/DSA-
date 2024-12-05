
import java.util.*; 
import java.io.*; 


class KCloseestNumber {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int k = 4;
        int x = 3;

        KCloseestNumber sol = new KCloseestNumber();

        ArrayList<Integer> res= sol.findClosestElements(arr, k, x);
        System.out.println(res);
    }

    static class Pair implements Comparable<Pair> {
        int absDiff;
        int value;

        Pair(int diff, int val) {
            absDiff = diff;
            value = val;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.absDiff == o.absDiff) {
                return this.value - o.value;
            }
            return this.absDiff - o.absDiff;
        }
    }

    public ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {

        int n= arr.length;
    
        ArrayList<Integer> ans = new ArrayList<>();
        // PriorityQueue<Pair> maxxHeap =  new PriorityQueue<>(Collections.reverseOrder()); 

        PriorityQueue<int[]> maxxHeap = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return b[0]-a[0];
        });

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i]-x);
            // maxxHeap.add(new Pair(diff, i));
            maxxHeap.add(new int[]{diff, arr[i]});

            if(maxxHeap.size()>k){
                maxxHeap.poll();
            }            
        }
        while(!maxxHeap.isEmpty()){
            // ans.add() = 
            ans.add(maxxHeap.poll()[1]);
        }

        Collections.sort(ans);

        return ans;
        
    }
}
