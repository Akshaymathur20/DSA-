class Nto1{
    public static void main(String[] args) {

        int n = 5;
        // fun(n);
        System.out.println();
        // fun1(n);
        System.out.println();
        // fun2(n);
        concept(n);
        
    }

    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // concept(n--);
        concept(--n);
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        fun(n-1);
    }
    
    
    static void fun1(int n){
        if(n==0){
            return;
        }
        
        // System.out.print(n+" ");
        fun1(n-1);
        System.out.print(n+" ");
    }

   //both 
    static void fun2(int n){
        if(n==0){
        return;
        }
        
        System.out.print(n+" ");
        fun1(n-1);
        System.out.print(n+" ");
    }
}