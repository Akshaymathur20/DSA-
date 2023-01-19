// package Arrays.Problems;


import java.util.Arrays;


public class max {
    public static void main(String[] args) {
         
        int [] arr = {12,35,1,10,34,1};

        //first approach;
        // System.out.println(sort(arr));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(MaxNum(arr));
        // System.out.println(maxRange(arr, 0, arr.length-1));
        // System.out.println(minRange(arr, 0, arr.length-1));
        System.out.println(MaxNum(arr));
    }

    // static int sort(int arr[]){
    //     Arrays.sort(arr);
    //     return arr[arr.length-2];
    // }

// }   
    
    //the arrays to find betwen the range of two index
   /*  static int maxRange (int [] arr , int start ,int end){
        // int max = Integer.MIN_VALUE;
        int maxx =arr[0];
        
        for(int i = 0;i<=end;i++){
            if(arr[i]>maxx){
                maxx = arr[i];
            }
            
        }
        
        return maxx;
        
    }
    static int minRange(int [] arr ,int start , int  end){
        int minn =arr[0];
        for(int i = 0;i<=end;i++){
            if(arr[i]<minn){
                minn = arr[i];
            }
            
        }
        return minn;
    }
} */

static int MaxNum(int [] num ){

    if(num.length == 0){
        return -1;

    }
    int  maxVal = num[0];
    for(int i = 1 ;i<num.length;i++){
        if(num[i-1] > maxVal){
                maxVal = num[i+1];
        }
    }
    return maxVal;
}
}