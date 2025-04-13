/*
 * Floor and Ceil of a sorted array
 * 
 * Floor--> Largest element from the smallest numbers from the k
 * 
 * Lets take an examplee
 * 
 *  [1,2,3,4,8,10,10,12,29]   Key =9
 * 
 *  from the array first we need to check which are teh number lesser the key
 * so in our case 1,2,3,4,8
 * now we have return max of the number which is 8 so 4 is our answer
 */

public class Question5 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,8,10,10,12,29};

        int key = 9;
        System.out.println(floorNumber(arr, key));

        System.out.println(ceilNumber(arr, key));
   
        int arr1[]={0,0,0,0,0,1,1,1,1,1};
        System.out.println(firstIndex(arr1));


    }

    static int floorNumber(int arr[],int target){
        int s =0;
        int e  =arr.length;

        int result =-1;
        while(s<=e){   //(0<=8) (5<=8)
            int m = (s+e)/2;  //m = 4 which is 8                  //m=6 which is 10 

            if(arr[m]==target){   //pass
                return arr[m];        
            }else if(arr[m]<target){ //(8<9)
                  result = arr[m];  //candidate of floor      //result = 8
                  s=m+1;         //s=4+1=5
            }else{               //(10>8)
                e= m-1;         //e= 5;
            }
        }
        return result;
    }

    //similar questoin --> First 1 in a sorted binary array
    static long firstIndex(int arr[]) {
        
        int s = 0;
        
        int e = arr.length-1;
        
        int result = -1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            
            if(arr[m]==1){
                result = m;
                e= m-1;
            }else if(arr[m]<1){
                 s=m+1;
            }else{
                e=m-1;
            }
        }
        return result;
        
        
    }
    
    
    static int ceilNumber(int arr[],int target){
        int s =0;
        int e  =arr.length;

        int result =-1;
        while(s<=e){   
            int m = (s+e)/2; 

            if(arr[m]==target){
                return arr[m];        
            }else if(arr[m]>target){ 
                s=m+1;         
            }else{               
                result = arr[m];  
                e= m-1;         
            }
        }
        return result;
    }
    
}
