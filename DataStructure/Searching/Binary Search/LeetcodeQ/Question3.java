/*
 * Number of times a sorted array is sorted
 *   0 1 2 3 4
 *   4,5,1,2,3  return 5,1,2,3,4 , 1,2,3,4,5  return 2
 * 
 *  0  1  2  3  4 5 6 7
 *  11,12,15,18,2,5,6,8
 *  12,15,18,2,5,6,8 --> 1
 *  15,18,2,5,6,8,11,12 --> 2
 *  18,2,5,6,8,11,12, 15 -->3
 *  2,5,6,8,11,12,15,18 --> 4 return 4
 * 
 * 
 *   2,3 4,1  --> return 3
 * 
 *   
 */

public class Question3 {
    public static void main(String[] args) {

        int arr[]={11,12,15,16,2,5,6,8};
        int target =16;

        int arr1[] =  {10, 3, 40, 20, 50, 80, 70};
        int target1 = 40;


        System.out.println(MinimumTimes(arr));
        System.out.println(OptimalMinimumTimes(arr));
        System.out.println(seachInRoatedArray(arr, target));
        System.out.println(nearlySorted(arr1, target1));


    }

    static int MinimumTimes(int arr[]){
        int n = arr.length;
        int minn= -1;
        for(int i =0;i<n;i++){
            //  minn= i;
             if(minn>arr[i]){
                minn=i;
             }
        }
        return -1;
    }

    static int  OptimalMinimumTimes(int arr[]){
        int s= 0;
        int e = arr.length-1;

        while(s<=e){

            //edge case
            //if the array is rotated

            if(arr[s]<=arr[e]) return s; //arr[s]

            int mid = (s+e)/2;

    
            int prev = (mid-1+arr.length)%arr.length;
            int next = (mid+1)%arr.length;

            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
                // return arr[mid];  --> for minimum element
            }else if(arr[mid]>arr[s]){
                  s = mid+1;   //move to right half
            }else{
                e = mid-1;   //moving to left half
            }
        }
     return -1;

    }

    //Follow up question question 
    //Find the minimum element in the sorted aray so just return the number 
    //Find an element in a rotated sorted array

   /*
    *  so for example
        11,12,15,18,2,3,5,7,8    target  = 5

        return 6 --> The index of target 

        Brute force --> Just we will simply check each and every element from the aray whehter if our nums[i] will become equal to the target we wil just return the index of that number an if it not found then we will retunr -1
        We take a loop called for loop and we will compare each and every element and return 

        TC -> since we are comparing each elemnt and in the worse case the element taget may appear in the last index so in the worse case scenario it woul traverse thorught n 
        so the time complexity would (O(n))
        SC--> Since wwe are not using any extra space  so Sapce complextiy would be (O(1));


        we can optimise the soluton by usin binary seach
        how? 

        11,12,15,2,4,5,8  

        s = 0 
        e = nums.length=-1
    */


    static int seachInRoatedArray(int arr[], int target){
       int s = 0;
       int e = arr.length-1;
       while(s<=e){
           int m = (s+e)/2;

           if(arr[m]==target) 
                return m;
           
           if(arr[s]<=arr[m]){
              if(arr[s]<=target && arr[m]>target){
                 s= m+1;
              }else{
                e = m-1;
              }
           }else{
                if(arr[m]<target && target<=arr[e]){
                    s=m+1;
                }else{
                    e=m-1;
                }
           }
       }
       return -1;
    }

    /*
 * Search in  nearly sorted array
 *                   0   1   2  3   4   5   6
 *  Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, x = 40
    Output: 2 

    Brute force aappraohc apply linear search
    similar of upper explation 

    Opimse by usin binary search


 *     
 */

 static int nearlySorted(int arr[],int target){

    int s =0;
    int e = arr.length-1;

    while(s<=e){
        int m =(s+e)/2;

        if(arr[m]==target){
            return m;
        }

        if ( m>s&& arr[m-1]==target){
              return m-1;
        }

        if(e>m && arr[m+1]==target){
               return m+1;
        }


        //if the element is smaller ->left
        if(arr[m]>target){
            e = m-2;
        }else{
            s=m+2;
        }


     }
     return -1;
    }

}
