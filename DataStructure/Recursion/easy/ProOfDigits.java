// package easy;

public class ProOfDigits {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(prod(n));
    }

    static int prod(int n){
       
        if(n%10==n){   //last digit will written itself here  break point.
            return n;
        }

        return prod(n/10)*(n%10);
    }
    
}
