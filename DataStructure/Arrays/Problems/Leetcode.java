package DataStructure.Arrays.Problems;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int [] arr = { 5,4,6,8,1,2};
        int target = 6;
        System.out.println(LiSearch(arr,target));
        
    }
    
        static int LiSearch(int[] nums,int target) {
            int n = nums.length;
            int square = 0;
            
            for(int i =0;i<n;i++){
                if(nums[i]==target){
                    return nums[i];
                }
            }
            
            return 1;
        }
    
}
