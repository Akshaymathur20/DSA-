import java.util.Arrays;

// package DataStructure.Sorting.MergeSort;

public class MergeRecur {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        // int[] ans= Mergetsort(arr);   
        arr = Mergetsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static int[] Mergetsort(int[]arr){


        //base condition
        if(arr.length==1){
            return arr;
        }


        //Divide the arrays into  two parts;
        int mid = arr.length/2;

        int [] left = Mergetsort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = Mergetsort(Arrays.copyOfRange(arr, mid,arr.length));


        //Now  merget the two divided arrays
     return merge(left, right);

    }

    private static int[]merge (int[] first, int [] second){
        int[]mix = new int[first.length + second.length];

        int i =0;
        int j=0;

        int k =0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the array is not complete
       //copy the remaining element
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
    
}
