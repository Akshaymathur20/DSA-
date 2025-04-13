import java.util.Arrays;
import java.util.Stack;

public class NextSmallestLeft {
    public static void main(String[] args) {
        int arr[]={1, 6, 4, 10, 2, 5};


    //    int [] ans = solve(arr);
       int []ans = NextSmallestLeft1(arr);
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
    static int[] NextSmallestLeft1(int nums[]){
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
 Initially, we can solve the problem using a brute force approach, where for each element, we iterate leftward to find the nearest smaller element. If found, we store it; otherwise, we return -1. However, this results in O(N²) time complexity, making it inefficient for large inputs as we repeatedly scan the same elements.

To optimize, we use a monotonic increasing stack, which allows us to process each element efficiently in O(N) time complexity. Instead of scanning left every time, we maintain a stack that keeps track of potential smaller elements in increasing order. As we process each element, we pop all elements that are greater or equal, ensuring the top of the stack always holds the nearest smaller element. This approach ensures each element is pushed and popped at most once, significantly reducing redundant comparisons and making it optimal for large datasets.
 */