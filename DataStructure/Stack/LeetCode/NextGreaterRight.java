import java.util.Arrays;
import java.util.Stack;

public class NextGreaterRight {
    public static void main(String[] args) {
        int arr[]={1,3,0,0,1,2,4};


       int [] ans = solve(arr);
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

    static int[] NextGreaterRight1(int nums[]){
        int n= nums.length;
        int [] ans= new int[n];
        Stack<Integer> stack = new Stack<>();


        for(int i = n-1;i>=0;i--){

            while(!stack.isEmpty() && nums[i]>stack.peek()){
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
}

/*
 * Brute Force Approach (O(N²))
The simplest way to solve this problem is by using a nested loop. For each element in the array, we scan all the elements to its right to find the next greater element. If we find a greater number, we store it and break the loop. Otherwise, we return -1. While this approach is intuitive, it is inefficient because for each element, we perform unnecessary comparisons, leading to O(N²) time complexity. This makes it impractical for large arrays, as it results in excessive computation.

Why Optimization is Needed?
The brute force approach scans the right side multiple times, repeating the same work for each element. We need an efficient way to remember previously processed elements and find the next greater element without re-scanning the array. A stack-based approach helps us achieve this in linear time by keeping track of useful elements dynamically.

Optimized Approach (O(N) Using Stack)
Instead of scanning each element’s right side multiple times, we process the array in reverse (right to left) using a monotonic decreasing stack. The idea is to maintain a stack where elements are stored in a decreasing order. As we move from right to left, we pop all smaller elements because they are no longer useful for the current element. The next greater element is simply the top of the stack after this cleanup. This approach ensures that each element is processed only once, making it highly efficient with O(N) time complexity. The stack helps us quickly determine the next greater element without redundant checks, making it a much better choice for large datasets.
 */
