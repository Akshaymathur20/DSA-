// package Bit Manipulation;

public class FIndUnique {
    public static void main(String[] args) {
        int [] arr  = {2,3,4,1,2,1,3,6,4};
        System.out.println(Unique(arr));


    }

    static int Unique(int[]arr){

        int unique =0;

        for(int n:arr){
           unique= unique ^ n;
         
        }
        return unique;
    }
    // Timc Complexity -- O(n);
}
