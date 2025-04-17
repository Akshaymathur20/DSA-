//https://leetcode.com/problems/partition-equal-subset-sum/description/

public class _03EqualSumPartition {
    public static void main(String[] args) {

        int nums[]={1,5,11,1,5};
    
        boolean ans = solve(nums);  
        System.out.println(ans);
        
    }
    static boolean solve(int arr[]){
        int n= arr.length;


        int sum =0;
        for(int i =0;i<n;i++){
            sum +=arr[i];
        }
        if(sum%2!=0){
            return false;
        }

        return dpSolution(arr, sum/2, n);
    }

    static boolean dpSolution(int arr[],int sum, int n){

        boolean dp[][]= new boolean[n+1][sum+1];


        //i-> size of array
        //j-> target sum (subset sum)
        for(int i =0;i<=n;i++){
            for(int j=0;j<=sum;j++){
              if(i==0){
                dp[i][j]=false; //shwen arr[i] is emty then there is no meaning of sum of element
              }
              if(j==0){   //wheen sum(j) is zero and there is always a chance  of empty subset  so return is as treu
                dp[i][j]= true;
              }
            }
        }

        //we will start withn 1 since first row and col is already considered
        for(int i =1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){

                    dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
                  }else{
                    dp[i][j]= dp[i-1][j];
                  }
            }
        }

        return dp[n][sum];
    }
    
}
