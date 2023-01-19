import java.util.Scanner;

// package Bit Manipulation;

public class oddeve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isOdd(n));
        
    }
    
    static boolean isOdd(int n){

      return (n&1)==1;

        // if((n&1)==1){
        //      return true;
        // }
  
            // for even 
        // if((n&1)==0){
        //     return true;
        // }
        // return false;

    }
}
