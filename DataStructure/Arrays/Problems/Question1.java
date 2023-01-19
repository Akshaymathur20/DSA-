// package Arrays.Problems;

// Q  - All the number occure twice except one number which occure once Find thenumber in the 0n tme & constant extra space

import java.util.Arrays;
public class Question1 {
    public static void main(String[] args) {
        int arr [] = {7, 3, 5, 1, 5, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(NumRep(arr));
    }

    static int NumRep(int arr[]){
        

        int nu = arr[0];
        for(int i = 1;i<arr.length-1;i++){
            nu = nu ^ arr[i];
        }
        return nu;
    }
    
}
