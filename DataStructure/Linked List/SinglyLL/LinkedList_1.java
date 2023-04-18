// package SinglyLL;

class LinkedList_1{


    private Node head;
    private Node tail;

    private int size ;

    public LinkedList_1(){
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node  = new Node(val);

        node.next = head;
        head = node;


        if(tail==null){
            tail = head;
        }

        size+=1;

    }
    public void insertEnd(int val){

        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node  = new Node(val);

        tail.next =node;
        tail= node;
     size+=1;

    }

    //Value at a paritcular index

    public void insert(int val , int index){

        if(index==0){
            insertFirst(val);
            return ;
        }

        if(index ==size){
            insertEnd(val);
            return;
        }

        Node temp  = head;
        for(int i =1;i<index;i++){
               temp =temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next= node;
        size++;

    }

    //Insert using recursion 
    public void insertRect(int val, int index)
    {
        head = insertRect(val, index,head);
    }
      private Node insertRect(int val, int index, Node node){

        if(index==0){
                Node temp = new Node(val,node);
                size++;
                return temp;
        }
        node.next = insertRect(val, index--, node.next);
           
        return node;
      }

    


    //Now delete from the linkedList

    public int deleteFirst(){
        int val = head.value;

        head = head.next;

        if(head==null){
            tail = null;
        }

        size--;
        return val;

    }

    public int deleteLast(){

        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);

        int val = tail.value;
        tail = secondLast;

        tail.next = null;

        return val;
    
    }

    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index ==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index){
        Node node= head;              // itw ill return reference pointer
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;

    }
    public Node find(int value){
        Node node= head;              // itw ill return reference pointer
        while(node !=null){
            if(node.value ==value){
                return node;
            }
            node = node.next;
        }
        return node;

    }
    
    public void display(){
        Node temp = head;

        while(temp !=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public  Node(int value , Node next) 
        {
            this.value = value;
            this.next = next;
            
        }
    }


    //Question 
    public void RemoveDuplicate(){
        Node node = head;

        while(node.next!=null){
            if( node.value==node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    
    // it will delete the number which is reapeated 

    // public ListNode deleteDuplicates(ListNode ) {
        // if(head ==null){
        //     return head;
        // }
        // ListNode node = head;
        
        // while(node.next!=null){
        //     if(node.val == node.next.val){
        //         node.next = node.next.next;
        //     }else{
        //         node = node.next;
        //     }
        // }
        // return node;
    // }



    //Merge

    public static  LinkedList_1 Merge(LinkedList_1 first,LinkedList_1 second){
        Node f = first.head;
        Node s = second.head;


    LinkedList_1 ans = new LinkedList_1();

    while(f!=null && s!=null){
        if(f.value<s.value){
            ans.insertEnd(f.value);
            f= f.next;
        }else{
            ans.insertEnd(s.value);
            s = s.next;
        }
    }
    while(f!=null){
     ans.insertEnd(f.value);
     f=f.next;
    }
    while(s!=null){

        ans.insertEnd(s.value);
     s=s.next;
    }
    return ans;

    }

    public void bubbleSOrt(){
        bubbleSort(size-1,0);
    }
        private void bubbleSort(int r, int c){
            if(r==0){
               return;
            }
            
            if(c<r){
                 Node first = get(c);
                 Node second = get(c+1);
                 if(first.value> second.value){
                    //swap
                    if(first==head){
                        head =second;
                        first.next=second.next;
                        second.next = first;
                    }else if(second==tail){
                        Node prev = get(c-1);
                        prev.next = second;
                        tail=first;
                        first.next=null;
                        second.next = tail;

                    }else{
                        Node prev = get(c-1);
                        prev.next = second;
                        first.next = second.next;
                        second.next = first;
                    }
                 }
                 bubbleSort(r,c+1);
            }else{
                bubbleSort(r-1,.0);
            }
        }
    
    public static void main(String args[]){
        // LinkedList_1 list = new LinkedList_1();
        
        // list.insertEnd(1);
        // list.insertEnd(1);
        // list.insertEnd(2);
        // list.insertEnd(3);
        // list.insertEnd(3);
        // list.insertEnd(3);
        // list.insertEnd(4);

        // list.display();
        
        // list.RemoveDuplicate();
        // list.display();

        LinkedList_1 first = new LinkedList_1();
        LinkedList_1 second = new LinkedList_1();

        first.insertEnd(1);
        first.insertEnd(3);
        first.insertEnd(5);

        second.insertEnd(1);
        second.insertEnd(2);
        second.insertEnd(9);
        second.insertEnd(14);

        
        first.display();
        second.display();
        LinkedList_1 ans = LinkedList_1.Merge(first, second);
        ans.display();

        ans.bubbleSort();
        list.display();
;    }

}

