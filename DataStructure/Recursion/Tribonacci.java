import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(tribonacci(n));   
    }

        static int tribonacci(int n) {
           
           if(n==0){
               return 0;
           }
           if(n==1 || n==2){
               return 1;
           }
            if(n>=3){
               return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
            }
           return n; 
        }
}
