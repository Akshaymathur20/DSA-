import java.util.Arrays;

// package DataStructure.Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-15,-10,2,65,654,9868};
        // System.out.println(Arrays.toString(arr));
        int target = 65;
        int ans = binary(arr,target);
        System.out.println(ans);
        // System.out.println(Arrays.toString(arr));
    }
    static int binary(int[] arr,int target){
        int start = 0;
        int end  = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    
}
