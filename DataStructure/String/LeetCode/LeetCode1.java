package DataStructure.String.LeetCode;

import java.util.Scanner;

class LeetCode1 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           System.out.println(firstUniqChar(s));   
    }
    
        static int firstUniqChar(String s) {
             int n = s.length();
    
             int [] arr = new int[26];
             for(char c:s.toCharArray()){
                 arr[c-'a']++;
             }
    
             for(int i=0;i<n;i++){
                 if(arr[s.charAt(i)-'a']==1){
                     return i;
                 }
             }
             return -1;
    }
}
