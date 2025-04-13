import java.util.Arrays;
import java.util.Stack;

public class NextSmallestRight {
    public static void main(String[] args) {
        int arr[]={2, 2, -1, 8, -1};


       int [] ans = NextSmallestRight1(arr);
       System.out.print(Arrays.toString(ans));
    }

    static int[] solve(int arr[]){
        int n= arr.length;


        int [] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i] = -1;
            for(int j =i;j<n;j++){
                if(arr[i]<arr[j]){
                   ans[i]=arr[j];
                   break;
                }
            }
        }
        return ans;
    }


    //optimal approach using stack -->O(n)

    static int[] NextSmallestRight1(int nums[]){
        int n= nums.length;
        int [] ans= new int[n];
        Stack<Integer> stack = new Stack<>();


        for(int i = n-1;i>=0;i--){

            while(!stack.isEmpty() && nums[i]<=stack.peek()){
                stack.pop();
            }
                 if(stack.isEmpty()){
                    ans[i] = -1;
                 }else{
                    ans[i] = stack.peek();
                 }

                 stack.push(nums[i]);
            }
        
        return ans;
    }
    /*
     * In the brute force approach, for each element, we scan all the elements to its right to find the next smaller element. If found, we store it; otherwise, we return -1. This results in O(N²) time complexity, as for every element, we traverse the remaining array, leading to redundant computations. While this approach works for small inputs, it becomes inefficient as the array size grows.

To optimize, we use a monotonic increasing stack, which allows us to determine the next smaller element in O(N) time complexity. Instead of scanning right every time, we traverse the array from right to left, maintaining a stack that stores potential candidates in increasing order. As we process each element, we pop all elements that are greater or equal, ensuring the stack always holds the nearest smaller element at the top. This way, each element is pushed and popped at most once, making the approach highly efficient and ideal for large datasets
     */
}
