import java.util.Arrays;
import java.util.Stack;

public class NextGreaterLeft {
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};


    //    int [] ans = solve(arr);
       int []ans = NextGreaterLeft1(arr);
       System.out.print(Arrays.toString(ans));
    }

    static int[] solve(int arr[]){
        int n= arr.length;


        int [] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i] = -1;
            for(int j =i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                   ans[i]=arr[j];
                   break;
                }
            }
        }
        return ans;
    }


    //optimal approach using stack -->O(n)

    static int[] NextGreaterLeft1(int nums[]){
        int n= nums.length;
        int [] ans= new int[n];
        Stack<Integer> stack = new Stack<>();


        for(int i = 0;i<n;i++){

            while(!stack.isEmpty() && stack.peek()>=nums[i]){
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
 In the brute force approach, for each element, we scan all the previous elements to find the nearest smaller element. If we find one, we store it; otherwise, we return -1. This approach is intuitive but inefficient because for every element, we traverse its left side, leading to O(N²) time complexity. As the array size grows, this results in excessive computations, making the approach impractical for large inputs.

To optimize, we need a way to track the nearest smaller elements efficiently without redundant comparisons. A monotonic increasing stack helps achieve this in O(N) time complexity. Instead of scanning the left side repeatedly, we use a stack to store potential smaller elements. While processing each element, we pop all greater elements, ensuring the stack always maintains the nearest smaller element at the top. This allows us to determine the answer for each element in constant time, making the approach highly efficient. The stack-based solution is optimal because each element is pushed and popped at most once, reducing unnecessary computations and making it ideal for large datasets
 */