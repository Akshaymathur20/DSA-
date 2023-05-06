package DataStructure.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CutomStack stack = new CutomStack();

        stack.push(34);
        stack.push(45);
        stack.push(32);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // stack.push(44);
        System.out.println(stack.pop());
    }
    
}
