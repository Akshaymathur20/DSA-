import java.util.Arrays;

// package DataStructure.Sorting.Insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5,3,4,1,2};
        System.out.println(Arrays.toString(arr));
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    // int temp = arr[j];
                    // arr[j]=arr[j-1];
                    // arr[j-1]= temp;  
                    // we can call it also by adding a method below
                }else{
                    break;
                }
                
            }
        }

    }
    static void swap(int[]arr  , int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
        
    }

    // another appraoach
    // static void  Insertion(int[]arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         int j=i-1;
    //         int temp  = arr[i];
    //         while ((j>=0) && (arr[j]>temp))  {
    //             arr[j+1]=arr[j];
    //             j--;
    //         }
    //         arr[j+1]= temp;

            
    //     }

    // }
   
    
}
