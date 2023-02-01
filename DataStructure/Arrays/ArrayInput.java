package DataStructureArrays;

// import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int []arr = new int[5];

        //take one one input 
        arr[0] = 20;
        arr[1] = 33;
        arr[2] = 32;
        arr[3] = 33;
        arr[4] = 22;*/
        // System.out.println(arr[3]);

        //draw back --> what if we want to take the array of 1000 or 10k so>


    //second way to take input  -->using loops

    // for(int i = 0;i<arr.length;i++){
    //     arr[i] = sc.nextInt();
 
    // }
    

   //now to take the output of the arrays.

   //first way using toString() , best way to get it
    // System.out.println(Arrays.toString(arr));

// //second method by loop
// for(int i = 0 ;i<arr.length;i++){
    
//     System.out.print(arr[i] + " ");
// }

//optimise way of for loop 
// for (int i : arr) {  //for every element in array , print the element
//     System.out.print(i+ " ");
    
// }


//arrays of object 
 String [] str = new String[3];
 for(int i = 0 ; i<str.length;i++){
    str[i] = sc.next();

 }
 System.out.println(Arrays.toString(str));
 str[1] = "Kaustubh";
 System.out.println(Arrays.toString(str));

 sc.close();
    }
    
}
