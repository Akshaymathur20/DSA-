// package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

import java.util.*;
class CustomComparator implements Comparator<Integer> {
 
    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
       
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[]= { 7,10,3,4,12,20};
        int k =3;

        System.out.println(usingSorting(arr, k));
        System.out.println(ksmallestelement(arr, k));

    }

    //here it will take the time complexity of nlogn 

    static int usingSorting(int arr[] , int k){
        Arrays.sort(arr);

        return arr[k-1];

    }



    static int ksmallestelement(int arr[] ,int k){

        int n = arr.length;

        //Below line can directly pass without making any othere class using 
        // PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new CustomComparator());

        for(int i = 0;i<n;i++){
            maxheap.add(arr[i]);
            if(maxheap.size()>k){
                maxheap.remove();
            }
        }
        return maxheap.peek();

    }
    
}
