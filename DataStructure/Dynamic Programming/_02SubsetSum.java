 class _02SubsetSum {

    public static void main(String[] args) {
        int arr[]= {2,3,7,8,10};
        int sum =21;

        // boolean ans = solution(arr, sum, arr.length-1);
        boolean res  = dpSolution(arr, sum, arr.length);
        
        System.out.println(res);
    }
    static  boolean solution(int arr[],int sum,int index){

        int n= arr.length;

        if(sum==0) return true;
        if(index==0) return arr[0]==sum;

        boolean notTake = solution(arr, sum, index-1);

        boolean take = false;

        if(arr[index]<=sum){
              take = solution(arr, sum-arr[index], index-1);
        }

        return take|| notTake;
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
