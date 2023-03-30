import java.util.Arrays;

// package DataStructure.Searching.BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-15,-10,2,65,654,9868};
        // System.out.println(Arrays.toString(arr));
        // int target = 65;
        System.out.println("Please enter the number ");
        int a = sc.nextInt();
    
        int ans = binary(arr,a);
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
