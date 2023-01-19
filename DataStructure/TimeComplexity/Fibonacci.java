class Fibonacci {
    public static void main(String[] args) {
        
        // System.out.println(fibbo(6));
        // System.out.println(fibFormula(6));
        for(int i =0;i<11;i++){
            System.out.print(fibFormula(i) + " ");
        }
        
    }

    //Now after solving complexity we have got the formula to find the it

    static int fibFormula(int n){
    //    return (int) ((Math.pow(((1+Math.sqrt(5))/2),n) - (Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));

       // we can also remove the - turn because they are less dominating
       return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }


    
    // static int fibbo(int n){

    //     //base condition

    //     if(n<2){
    //         return n;
    //     }
    //     return fibbo (n-1)+ fibbo(n-2);
    // }
    
}
