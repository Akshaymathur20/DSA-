package DataStructure.Stack;

public class CutomStack {
         
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;

    int ptr =-1;

    public CutomStack(){
        this(DEFAULT_SIZE);
    }

    public CutomStack(int size){
           this.data  = new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full ");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop form and empty stack");
        }
        // int removed= data[ptr];
        // ptr--;
        // return removed;

        return data[ptr--];
    }

    //what is at the top

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek form and empty stack");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length-1;

    }

    private boolean isEmpty(){
        return ptr ==-1;
    }


}
