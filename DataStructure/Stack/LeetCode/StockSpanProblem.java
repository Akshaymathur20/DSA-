import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};

       int ans[]= stockSpan(arr);
       System.out.println(Arrays.toString(ans));
       int res[]= stockSpan1(arr);
       System.out.println(Arrays.toString(res));

    }
    static int[] stockSpan(int nums[]){
        int len = nums.length;

        int ans[] = new int[len];

        for(int i =0;i<len;i++){
            int count = 1;
            for(int j =i-1;j>=0 && nums[j]<=nums[i];j--){
               count++;
            }
            ans[i]= count;
        }
        return ans;
    }
    static int[] stockSpan1(int nums[]){

        int len= nums.length;

        int[] ans= new int[len];
        Stack<Integer> stack= new Stack<>();

        for(int i =0;i<len;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return ans;

       /*
       How the Stack Works
The stack stores indices of stock prices in decreasing order.
If the current price is higher, we pop elements from the stack (as they are smaller and irrelevant).
If the stack becomes empty, it means the current price is the highest seen so far, so its span is (i + 1).
If the stack has elements, the nearest greater price's index helps compute the span as (i - stack.peek()).      
       */ 
    }
}


/**
 In the brute force approach, for each stock price on day i, we look backward to count how many consecutive days (including i) had a price less than or equal to the current price. This requires scanning previous elements for each day, leading to O(N²) time complexity. While simple, this approach becomes inefficient for large datasets as it involves repetitive comparisons.

To optimize, we use a monotonic decreasing stack, which allows us to compute the span in O(N) time. Instead of scanning left for each day, we maintain a stack storing indices of previous stock prices in decreasing order. As we process each day's price, we pop all elements smaller than or equal to the current price, ensuring the top of the stack always holds the nearest greater element on the left. This way, each element is pushed and popped at most once, reducing unnecessary computations and making it ideal for large datasets
 */
