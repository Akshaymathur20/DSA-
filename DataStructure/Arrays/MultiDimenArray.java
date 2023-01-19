package Arrays;


import java.util.*;

public class MultiDimenArray {
    public static void main(String[] args) {

        //what is 2D or multidimension or matrix array 
        /*
         { 1 2 3
           4 5 6
           7 8 9  }
         */

         //intilisation

       /*   int [][] arr= new int[3][3];      //[rows][col]  --> row is mendatory to fill

         int [][] arr1= {
        
            {1,2,3},
            {4,5,6},
            {7,8,9}
         };

        System.out.println(Arrays.toString(arr1[1])); //[4,5,6] 

        */


        //Taking input for the multidimension array or matrix or 2 D Array

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        // System.out.println(arr.length);
        
        //input
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //It will not  work because  the enhance for loop the elements of the iterable , as assigning value doesn;t chang ethe original array 
        //it wil  give [0,0,0,0,0,0,0,0,0]

        // for (int[] is : arr) {
        //     for (int is2 : is) {
        //         is2 = sc.nextInt();
                
        //     }
            
        // }



        //OUTPUT

        // first way 

        //   for(int row =0; row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        //   }

        //second way 

          /*    for(int row =0; row<arr.length;row++){
              System.out.println(Arrays.toString(arr[row]));
          }*/

          //third way
          for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            
          }
  sc.close();
    }
    
}
