package DataStructure.Sorting.Bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        // int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Sorted array is below");
        System.out.println(Arrays.toString(arr));
        
    }

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
        static void swap(int[]arr  , int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
        
    }

    }
    
}
