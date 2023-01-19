// package DataStructure.Sorting.Cyclicsort.QuestionsLeetocde;

//Missing number in the array. 

import java.util.Arrays;

public class Ques_268 {
   
    static int Missing(int[]nums ){
        
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if((nums[i]<nums.length)&&(nums[i] != nums[correct])){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

        //search for first missing numbers 
        //case 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
            
        }

        //case 2 \
        return nums.length;
    }
    static void swap(int[]nums  , int first, int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
        
    }
    
}
