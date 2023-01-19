

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(67);
        // list.add(68);
        // list.add(69);
        // list.add(65);
        // list.add(61);
         
        // System.out.println(list.contains(61));
        // System.out.println(list);

        // list.set(0, 2);



        // list.remove(2);
        // System.out.println(list);


        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            
        }

        //get item at any index 
        for (int i = 0; i < 5; i++) {
           System.out.print(list.get(i) + " "); //pas index her,  list [index] syntac will not work  here 
            
        }
        System.out.println(list);
      
       




    }
    
}
