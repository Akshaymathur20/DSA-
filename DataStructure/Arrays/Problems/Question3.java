public class Question3 {
    public static void main(String[] args) {
        int nums[] = {6,1,2,3,4,5};
        System.out.println(check(nums));
        
    }

        static boolean check(int[] nums) {
            
            int n = nums.length;
            
            // boolean bool = true;
            
            // if(n==0 || n==1){
            //    return bool;    
            // }
            for(int i =1;i<n;i++){
               if(nums[i-1]>nums[i]){
                   return false;
               }       
            }
            return true;
            
     }
    
}
