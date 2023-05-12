package DataStructure.Stack.LeetCode;

import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
       System.out.println(isValid(str));
        
    }

    static boolean isValid(String s) {
             
        //Let's make a stack
        Stack<Integer> st = new Stack<>();
        
        for(int i =0;i<s.length();i++){
           if(s[i]=='(' || s[i]=='{' || s[i]==']')
               st.push(s[i]);
            
           else{
               if(s.Empty()==true){
                   return false;
               }else if(matching(s.top(),str[i])==false){
                   return false;
               }
               else{
                   s.pop();
               }
           }
        }
        
    }
        boolean matching(char a , char b){
            return ((a=="(" && b==")")|| (a=="{" && b=="}")|| (a=="[" && b=="]"));
        }
       
    
}

