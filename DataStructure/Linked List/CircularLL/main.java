import java.util.LinkedList;

// package CircularLL;

public class main {
 

    public static void main(String[] args) {
        LinkedList_3 list = new LinkedList_3();

        list.insert(55);
        list.insert(25);
        list.insert(54);
        
        list.display();
        list.delete(25);
        list.display();
    }

    
}
