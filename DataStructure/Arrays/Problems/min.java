package Arrays.Problems;


import java.util.Arrays;
public class min {
    public static void main(String[] args) {
        int [] arr = { 5,6,8,4,2};
        System.out.println(Arrays.toString(arr));
        // System.out.println(Min(arr));
        System.out.println(MinVal(arr, 0, 3));
    }

    // static int Min(int[] arr ){
        
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     //suppose 
    //     int min = arr[0];
    //     for(int i =0;i<arr.length;i++){
    //         if(arr[i]<min){
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }

    static int MinVal(int [] arr, int start  , int end){

        if(arr.length==0){
            return -1;
        }
        //  suppose 
        int min = arr[0];
        for(int i =0;i<=end;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
}
