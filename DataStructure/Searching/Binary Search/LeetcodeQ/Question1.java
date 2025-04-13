// 1st and last occurence of a number 


public class Question1 {
    public static void main(String[] args) {
        // System.out.println("hello");

        int arr[]= {2,4,10,10,10,18,20};

        int n = arr.length;
        int target = 10;
      
        // System.out.println(firstOccurence(arr,target));
        // System.out.println(lastOccurence(arr,target));
        
        int result[]= firstAndlastOccurence(arr, target);
        System.out.println("First and Last Occurrence: [" + result[0] + ", " + result[1] + "]");
    }


    static int firstOccurence(int arr[],int target){
         
        int n= arr.length;

        // //brute force
        // for(int i =0;i<n;i++){
        //     if(arr[i]==target){
        //         return i;
        //     }
        // }
        // return -1;

        //binary serch algo

        int s=0;
        int e = arr.length-1;

        int result =-1;

        while(s<=e){
            int m = s+(e-s)/2;

            if(arr[m]==target){
                // return m
                // check its first occurnece or not
                result = m;

                //we will continue our search our left side
                e= m-1;

            }else if(arr[m]<target){
                 s=m+1;
            }else{
                e=m-1;
            }
        }
        return result;
    }

    
    static int lastOccurence(int arr[],int target){
         
        int n= arr.length;

        // //brute force
        // for(int i =0;i<n;i++){
        //     if(arr[i]==target){
        //         return i;
        //     }
        // }
        // return -1;

        //binary serch algo

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
                s= m+1;

            }else if(arr[m]<target){
                 s=m+1;
            }else{
                e=m-1;
            }
        }
        return result;
    }

    //we can more improve it by doing this in single problem instead
     /*
      * 1) We have reduced function to call
        2) Cleaner and more efficience approach
        3) Beter to read --> readability
        
        Time Complexity--> o(logn) for search
        spach complexity-> o(1) we only 
      */

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

    static int[] firstAndlastOccurence(int arr[],int target){

        // int first = firstOccurence(arr,target);
        // int last = lastOccurence(arr,target);

        int first = findOccurence(arr,target,true); //first occurence
        int last = findOccurence(arr,target,false); //second occurence
        return new int[]{first,last};
    }

    
}
