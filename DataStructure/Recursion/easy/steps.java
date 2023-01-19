public class steps {

    public static void main(String[] args) {
        
    }

    public int numberOfSteps(int n){
        return helper(num,0);

    }

    private int helper(int num, int steps){
        if(num==0){
            return n;
        }

        if(num%2==0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
    
}
