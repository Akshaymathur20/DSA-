// Question link --> 583 -> https://leetcode.com/problems/delete-operation-for-two-strings/

import java.util.Scanner;

public class LeetCode583 {
    public static void main(String[] args) {
        //take the input for the strings
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(minDistance(word1, word2));
    }
     static int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int arr[]= new int[n+1];

        for(int j =0;j<=n;j++){
            arr[j]=j;
        }

        for(int i =1;i<=m;i++){
            int prev = arr[0];
            arr[0]=i;
            for(int j =1;j<=n;j++){
                int temp = arr[j];
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[j]=prev;
                }else{
                    arr[j]= 1 + Math.min(arr[j], arr[j-1]);
                }
                prev=temp;
            }
            
        }
        return arr[n];
        
    }

}
