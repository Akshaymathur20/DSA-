package DataStructure.Stack;


//in this severything will be same 

public class DynamicStack extends CutomStack{
    public DynamicStack(){
        super();  // ite will call CustomStack();
    }

    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array siae
            int[] temp = new int [data.length*2];

            //cop all the pervious item in ne data
            for(int i =0;i<data.length;i++){
                temp[i]=data[i];
            }
            data = temp;

        }


        //at this  point we know that array is no tfull 
        //insert item
        return super.push(item);
    } 
}
