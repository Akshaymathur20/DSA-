package Searching.Binary Search.LeetcodeQ;



//Question-->  https://leetcode.com/problems/first-bad-version/


public class Ques_278 {
    
    public int firstBadVersion(int n) {
        int start =0;
        int end = n-1;
          
          int result = n;
         while(start<=end){
          int  mid = start+(end-start)/2;
             if(isBadVersion(mid)){
                 result= mid;
                 end=mid-1;
             }else{
                 start = mid+1;
             }
         }
         return result;
         
     }
    
}
