 // package MathsForDSA;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(isPrime(n));

        //the below will give the odd number from 1 to n number;

        for (int i = 2; i <=n; i++) {
            System.out.println(i + " " +isPrime(i));
            
        }
    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    // static boolean isPrime(int n){

    //     if(n<=1){
    //         return false;
    //     }
        
    //     int c = 2;
    //     while(c*c<=n){
    //         if(n%c==0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return true;
    // }
    
}
