package DataStructure.Stack;

public class CutomStack {
         
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;


    //intially the pointer lies here 
    int ptr =-1;

    public CutomStack(){
        //when nothing is  pass
        this(DEFAULT_SIZE);
    } 

    public CutomStack(int size){
           this.data  = new int[size];

    }

    //Inseting data in it 
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full ");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop form and empty stack");
        }
    //    int removed = data[ptr];
    //    ptr--;
    //    return removed;
       
        return data[ptr--];
    }

    //what is at the top 
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek form and empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;  //ptr is at the last index 

    }

    public boolean isEmpty(){
        return ptr ==-1;   //when stack has no value 
    }


}
