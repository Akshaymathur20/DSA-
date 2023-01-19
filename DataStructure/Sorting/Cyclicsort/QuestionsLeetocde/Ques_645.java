// package DataStructure.Sorting.Cyclicsort.QuestionsLeetocde;

public class Ques_645 {
    
    public static void main(String[] args) {
        
    }
    public int[] setMismatch(int[]nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if((nums[i] != nums[correct])){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

        //search for first missing numbers 
        //case 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){ //because wer takin from 1 to n
                return new int[]{ nums[j] , nums[i+1]};
            }
            
        }

        //case 2 \
        return new int[] { -1,-1};
    }
    static void swap(int[]nums  , int first, int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
        
    }
    
    
}
