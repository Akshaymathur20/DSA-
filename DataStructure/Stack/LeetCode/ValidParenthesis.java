// package DataStructure.Stack.LeetCode;

import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        String s = "{[())]}";
       System.out.println(isValid(s));
       System.out.println(isValid1(s));
        
    }
    
    static boolean isValid(String s){
        while(s.contains("()") ||
              s.contains("{}") ||
              s.contains("[]")
              ){
                s= s.replace("()", "")
                    .replace("{}","")
                    .replace("[]","");
            }
        return s.isEmpty();
    }
    static boolean isValid1(String s){
        int len = s.length();

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()|| !isMatching(stack.pop(),ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean isMatching(char open, char close){
        return (open =='(' && close==')') || (open=='{' && close=='}') || (open =='[' && close==']');
    }
}
/*
 *In the brute force approach, we check each closing bracket and scan backward to find its corresponding opening bracket. This leads to O(N²) time complexity as every unmatched closing bracket requires multiple lookups, making it inefficient for large inputs. Additionally, keeping track of nested structures manually becomes complex and error-prone.

To optimize, we use a stack-based approach, which allows us to process each character in a single pass (O(N) time complexity). We iterate through the string, pushing opening brackets onto the stack and popping them when encountering a matching closing bracket. If the stack is empty when a closing bracket appears or is non-empty at the end, the string is invalid. This method ensures efficient, structured validation, making it ideal for handling large expressions in real-time applications like compilers and parsers.
 */

