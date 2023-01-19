// package Arrays;

// // import java.util.*;

// public class RaggedArray {
//     public static void main(String[] args) {
//         int r = 5;
//         int[][] arr = new int[r][];

//         for(int row= 0;row<arr.length;row++)
//             arr[row] = new int[row+1];

//             //intilizing array
//             int count = 0;
//             for(int row= 0;row<arr.length;row++){
//                 for(int col = 0; col<arr[row].length;col++ ){
//                   arr[row][col]=count++;
//                 }
//             }

//         System.out.println("Ragged Array");
        
//         // for (int[] is : arr) {
//         //     System.out.println(Arrays.toString(is));
            
//         // }
//         for(int row = 0;row<arr.length;row++){
//             for(int col =0;col<arr[row].length;col++){
//                 System.out.print(arr[row][col]+ " ");
//             }
//             System.out.println();
//         }
        
//     }
    
// }
package Arrays;

// import java.util.*;

public class RaggedArray {
    public static void main(String[] args) {
        int r = 5;
        int[][] num = new int[r][];

        input(num);
        System.out.println("Ragged Array");
        output(num);

        System.out.println("\nOK done for today's it's nearly 2 Am now");
    }

    static void input(int [][]arr){
        for(int row= 0;row<arr.length;row++)
        arr[row] = new int[row+1];

        //intilizing array
        int count = 0;
        for(int row= 0;row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++ ){
              arr[row][col]=count++;
            }
        }
    }

    static void output(int [][] arr1){
         // for (int[] is : arr) {
        //     System.out.println(Arrays.toString(is));   //it will give answer inside the braccket
            
        // }
        for(int row = 0;row<arr1.length;row++){
            for(int col =0;col<arr1[row].length;col++){
                System.out.print(arr1[row][col]+ " ");
            }
            System.out.println();
        }
    }
    
}
