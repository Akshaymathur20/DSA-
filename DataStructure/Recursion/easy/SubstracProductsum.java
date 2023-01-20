// package DataStructure.Recursion.easy;

public class SubstracProductsum {
    public static void main(String[] args) {
        int n  = 4421;
        System.out.println(substractProductAndSum(n));
    }

    static int substractProductAndSum(int n){
        int sum =0;

        int product =1;

        while(n>0){
            sum = sum +(n%10);
            product = product * (n%10);

            n /=10;

        }
        return product-sum;
    }
    
}
