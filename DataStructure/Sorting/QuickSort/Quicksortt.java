// package Sorting.QuickSort;

import java.util.Arrays;

public class Quicksortt {
    public static void main(String[] args) {

        int[] arr= {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void sort(int[] nums,int low ,int high){
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s+(e-s)/2;
        
        int pivot = nums[mid];

        while(s<=e){

            //also a reason why if its already sorted ti will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp =nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }


        //Now my pivot is at correct index,please sort two halves now
     sort(nums, low, e);
     sort(nums, s, high);
    }
}
