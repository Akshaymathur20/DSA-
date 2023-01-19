import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// package DataStructure.Sorting.Cyclicsort.QuestionsLeetocde;

public class Ques_448 {
    // public static void main(String[] args) {
    //     int[] arr = { 1,1,3,4,5,5,7};
    //     System.out.println(Arrays.toString(arr));
        
        
    // }
    public List<Integer> finDissppearedNumbers(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if((nums[i]<nums.length)&&(nums[i] != nums[correct])){
                swap(nums,i,correct);
            }else{
                i++;
            }

            
        }

        //Here we will find the missing  number 

        List<Integer> ans = new ArrayList<>();
        for (int index= 0; index < nums.length; index++) {
            if(nums[index] != index +1){
                ans.add(index+1);
            }
            
            
        }
        return ans;

    }
    static void swap(int[] nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
