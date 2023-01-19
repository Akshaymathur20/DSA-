import java.util.Scanner;

// package Bit Manipulation.Problems;


//Question link ---> 231
// https://leetcode.com/problems/power-of-two/?envType=study-plan&id=algorithm-i

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPowerOfTwo(n));
        
    }

    //this is the solution you have to put  in leetcode just remove static and put public 
     static boolean isPowerOfTwo(int n) {
       
        if(n==1){                    /*  n==1  it will return true */
            return true; 
        }
        if(n%2!=0 || n<=0){    
              return false; 
        }
        return isPowerOfTwo(n/2);     /*  if n =16  then 16/2=8 8/2=4 4/2=2 2/2 =1 */
    }
}

 
// similar question
// https://leetcode.com/problems/power-of-three/
// https://leetcode.com/problems/power-of-four/