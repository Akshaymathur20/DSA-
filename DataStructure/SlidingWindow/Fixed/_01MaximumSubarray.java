package DataStructure.SlidingWindow.Fixed;

import java.util.Scanner;

public class _01MaximumSubarray {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int arr[]= {2,3,1,8,2,9,1};
          int k =3;

    System.out.println( MaximumSubarraySizeK(arr, k));
    System.out.println(MinimumSubarraySizeK(arr, k));
    sc.close();

    }
    static int MaximumSubarraySizeK(int nums[],int k){

        int n= nums.length;
        int i=0,j=0,maxx=Integer.MIN_VALUE,sum=0;

        while (j<n) {
            int windowSize = j-i+1;
            sum +=nums[j];

            if(windowSize<k){
                j++;
            }
            else if(windowSize==k){
                maxx = Math.max(maxx, sum);
                sum -=nums[i];
                i++;
                j++;
            }
            
        }
        return maxx;
    }
    static int MinimumSubarraySizeK(int nums[],int k){

        int n= nums.length;
        int i=0,j=0,minn=Integer.MAX_VALUE,sum=0;

        while (j<n) {
            int windowSize = j-i+1;
            sum +=nums[j];

            if(windowSize<k){
                j++;
            }
            else if(windowSize==k){
                minn = Math.min(minn, sum);
                sum -=nums[i];
                i++;
                j++;
            }
            
        }
        return minn;
    }    
}

