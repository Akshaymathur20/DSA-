// package SinglyLL;

public class Main {

    public static void main(String[] args) {
        LinkedList_1 list= new LinkedList_1();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insertEnd(5);

        list.insert(255, 3);
        list.display();
        // System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
     
        list.display();

        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(255));

        list.insertRect(88, 2);
        list.display();



    }
    
}
