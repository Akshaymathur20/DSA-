// package DataStructure.Sorting.Selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        // System.out.println(Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));


        
    }
    static void selectionsort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining  array and swap with  correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);

             //it will  swap  4 with 1;
            swap(arr,maxIndex,last);
            
        }
    }
    static void swap(int[]arr  , int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
        
    }

    static int getMaxIndex(int[]arr, int start , int end){
        int max  = start;
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    
}
