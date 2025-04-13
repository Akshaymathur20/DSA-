class Node{
    int data;
    Node next;   //referce to the next node


    Node(int data){
        this.data= data;
        this.next= null;
    }
}

public class LinkedList{

      Node head;

      //insertation at  the end
      Node insert(Node head, int data){
        Node newNode= new Node(data);

        if(head==null){
            // head= newNode;
            return newNode;
        }
     
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        return head;

      }

       //printing the list
      void printList(Node head){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp= temp.next;
            }
            System.out.println("null");
      }


      Node deteteNode(Node head, int key){
          if(head==null) return null;

           //if head needs to be delted
          if(head.data==key){
            return head.next;
          }

          Node temp = head;

          while(temp.next!=null && temp.next.data!=key){
            temp = temp.next;
          }
          if(temp.next!=null){
              temp.next=temp.next.next;
          }
          return head;
      }

      public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        Node head= null;

       //insertin elements
       head= list.insert(head,10); 
       head= list.insert(head,20); 
       head= list.insert(head,30); 
       
       System.out.println("List After Insertion");
       list.printList(head);
       head= list.insert(head, 40);
       list.printList(head);


       //detete the linked list from and end
       head= list.deteteNode(head, 20);
       list.printList(head);
      }


}