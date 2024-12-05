// package Greedy;

/*
 * Imagine you are at a vending machine that only accept coins. You need to pay Rs 16 and you have acoins of Rs 1, Rs5 and Rs 10 . The goal is to use minimum coins possible.
 * 
 * Approach -1--> check for all possible test cases like 1 for 16 times or 5,5,5,1 etc
 * Greedy -> Always pick the largest and minus it from the total coins
 */

public class Example1 {
    public static void main(String[] args) {
        int toPay = 16;

        int arr[]={10,5,1};


        int count =0;
        for(int i =0;i<arr.length;i++){
           
            while(toPay>=arr[i]){
                toPay -=arr[i];
                count++;
            }

        }
        System.out.println(count);
    }
    
}
