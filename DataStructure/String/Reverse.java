import java.util.*;
public class Reverse {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      String str = sc.next();

      System.out.println(reverse1(str));
      System.out.println(reverse2(str));
      System.out.println(reverse3(str));
      System.out.println(reverse4(str));


    }
    
    static String reverse1(String str){
        int n= str.length();

        String newString = "";
        char ch;

        for(int i=n-1;i>=0;i--){

            ch = str.charAt(i);

            newString +=ch;
        }

        return newString;
        /*
         * 
    The time complexity of the provided reverse1 method is O(n^2) due to string concatenation inside the loop. In each iteration of the loop, a new character is appended to the newString, and since strings in Java are immutable, a new string is created every time a character is added. This results in quadratic time complexity because the concatenation of strings takes O(n) time, and this operation is performed in each iteration of the loop.
         */
    }

    static String reverse2(String str){

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<str.length()/2;i++){

            int start = i;
            int end = str.length()-1-i;


            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);
        }

        return sb.toString();

        /*
         * This approach has a time complexity of O(n), where 'n' is the length of the input string. The loop iterates through only half of the string, swapping characters at symmetric positions, making it more efficient than the original quadratic approach.

In terms of space complexity, it is O(1) because the method performs the reversal in-place using a StringBuilder, and the extra space used is constant regardless of the size of the input string. The space complexity of O(1) is considered very efficient in this context.
         */
    }

    static String reverse3(String str){
        int n= str.length();

        StringBuilder sb =new StringBuilder(n);

        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();

        /*
         * With the modification using StringBuilder, the time complexity of the reverse2 method is O(n). The reason is that each character is appended to the StringBuilder in constant time, and the length of the input string is 'n'. The overall time complexity is linear, making it more efficient compared to the original version with string concatenation, which had a time complexity of O(n^2).
         */
    }

    static String reverse4(String str){
        return new StringBuilder(str).reverse().toString();

        /*
         * This approach directly creates a StringBuilder from the input string, calls the reverse method on it, and converts it back to a string using toString(). This is concise and efficient, with a time complexity of O(n), where 'n' is the length of the input string.
         */
    }

    
}
