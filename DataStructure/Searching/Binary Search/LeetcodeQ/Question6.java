/*
 * Find the element in infinite sorted array
 *   
 *   arr= { 1,2,3,4,5,6,7,8,9,10..................}
 */

public class Question6 {
    public static void main(String[] args) {
        
    }

    static int InfitniteSOrted(int arr[],int target){

        int s =0;
        int e = 1;

        while(target>arr[e]){
              s  =e;
              e =2 *e;
        }

        while(s<=e){
           
            int m = (s+e)/2;

            if(arr[m]==target){
                return m;
            }else if(arr[m]<target){
                s= m+1;
            }else{
                e= m-1;
            }
        
        }
        return -1;
    }
    
}
