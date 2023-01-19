
import java.util.ArrayList;
public class Factors {
    public static void main(String[] args) {
        factor(20);
        
    }

    // static void factor(int n){
    //     for (int i = 1; i <=n; i++) {
    //         if(n%i==0){
    //             System.out.print(i +" ");
    //         }    
    //     }
    // }   //(O(n))


    // static void factor(int n){
    //     for (int i = 1; i*i <=n; i++) {
    //         if(n%i==0){
    //             if(n%i==i){
    //                 System.out.print(i + " ");
    //             }else{
    //                 System.out.print(i + " " +n/i+ " "  );
    //             }
    //         }    
    //     }
    // }   //(O(sqrt(n)))


    //now both time and space will be O(sqrt(n))
    static void factor(int n){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <=n; i++) {
            if(n%i==0){
                if(n%i==i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }    
        }


        //now it will print it the answer in shorted order 
        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }   //(O(sqrt(n)))
}
