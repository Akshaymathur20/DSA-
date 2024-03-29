// package DataStructure.Sorting.Bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        // int [] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        buble(arr);
        // bubblesort(arr);
        System.out.println("Sorted array is below");
        System.out.println(Arrays.toString(arr));
        
    }

    static void  buble(int [] arr ){
         int n= arr.length;

         for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            // System.out.println();
         }
    }
    //Tha above function always runw O(n^2) time even if the array is sorted.It can be optimzed by stopping the algorithm if the inner loop didn't cause any swap so below is the optimise approach for this 

    static void bubblesort( int[] arr){

        //run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            //for each step, max item will come at the last respective index
            for (int j = 1; j <arr.length-i; j++) {
                //swap if the items is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;

                    swapped = true;
                }
                
            }

            //If you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){    //!false = true , swapped:false
                break;
            }
            
        }
    //     static void swap(int[]arr  , int first, int second){
    //     int temp = arr[first];
    //     arr[first] =arr[second];
    //     arr[second]=temp;
        
    // }

    }
    
}
