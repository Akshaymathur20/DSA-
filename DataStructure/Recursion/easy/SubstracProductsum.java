// package DataStructure.Recursion.easy;

public class SubstracProductsum {
    public static void main(String[] args) {
        int n  = 7838;
        System.out.println(substractProductAndSum(n));
    }

    static int substractProductAndSum(int n){
        int sum =0;

        int product =1;

        while(n>0){
            sum = sum%10;
            product =  product*1;

            n = n/10;

        }
        return product-sum;
    }
    
}
