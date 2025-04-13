/*
 *  Question--> Count of an element in a sorted array
 * 
 *   [2,4,10,10,10,18,20] target = 10
 *     Output 3 -> 10
 * 
 * It is a variation of first and last occurcne
 * how?
 * since we know how to find the first and last occurnce
 * we just need to simple find the number of element between them 
 * sot just last - first and them one  (last-first)+1;
 */
public class Question2 {
    public static void main(String[] args) {
      
            
            int arr[]= {2,4,10,10,10,18,20 };
            int target = 10;

            System.out.println(solveCount(arr, target));

            System.out.println(firstAndlastOccurence(arr, target));
        
    }

    //brute force arpproach
 
    static int solveCount(int arr[],int target){
        int n= arr.length;
        int count =0;

        for(int i =0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    static int findOccurence(int arr[],int target,boolean Occur){
        int s=0;
        int e = arr.length-1;

        int result =-1;

        while(s<=e){
            int m = s+(e-s)/2;

            if(arr[m]==target){
                // return m
                // check its first occurnece or not
                result = m;

                //we continued our search for right side
                if(Occur){
                    e=m-1;
                }else{
                s= m+1;
                }

            }else if(arr[m]<target){
                 s=m+1;
            }else{
                e=m-1;
            }
        }
        return result;
    }

    static int firstAndlastOccurence(int arr[],int target){

        // int first = firstOccurence(arr,target);
        // int last = lastOccurence(arr,target);

        int first = findOccurence(arr,target,true); //first occurence  //2
        int last = findOccurence(arr,target,false); //second occurence  //4

       int count = last - first;    //4-2=2

        return count+1;    //2+1
    }

    
}
