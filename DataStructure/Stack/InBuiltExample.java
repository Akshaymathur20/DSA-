package DataStructure.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class InBuiltExample {
    
    public static void main(String[] args) {

        //Basic program of stack 
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(20);
        stack.push(35);
        System.out.println(stack.peek()); //WIll return the  top element form the stack
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size()); //Will show the how many element are present in the stack

        stack.push(5);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty()); //Return true if stack is empty (In our case it will return false as elements are present in the stack );
         



        // Stack<Integer> stack= new Stack<>();

        // stack.push(34);
        // stack.push(45);
        // stack.push(32);
        // stack.push(3);
        // stack.push(4);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

    }
}
