package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// public class ArraysPassInfunction {
//     public static void main(String[] args) {
//         int[] num= { 1,4,6,8,10};
//         System.out.println(Arrays.toString(num));
//         // for (int i : num) {
//         //     System.out.println(i + " ");
//         // }
//         change(num);
//         System.out.println(Arrays.toString(num));
//     }

//     static void change(int[]arr){
//         arr[0] = 2;
//     }
    
// }


public class ArraysPassInfunction {
    public static void main(String[] args) {

        String [] arr1= new String[3];
        input(arr1);
         System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    
   static void input(String[] str){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<str.length;i++){
            str[i] = sc.next();
          }
          sc.close();
    }

    static void change(String[]arr){
        arr[1] = "Kautubh";
    }
}