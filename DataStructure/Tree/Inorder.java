// Question link --> https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;
import java.util.Stack;


/*
 * Let me explain -> Suppose we have a tree 
 *              1
 *           2     3
 *         4  5   6  7
 * 
 * Inorder--> In order we take first left Root right
 * Output --> 4->2->5->1->6->3->7
 */

// class Node {  
//      int value;  
//      Node left,right;  

//     Node(int data)  
//     {  
//         value = data;  
//         left = right = null;  
//     }  
// }  

// class Inorder {  
//     Node root;  
//     Inorder() { 
//         root = null; 
//     }  

//     //for leetCode Solution you can copy this 
//     void traverseInorder(Node node)  
//     {  
//         if (node == null)  
//             return;  
//         traverseInorder(node.left);  
//         System.out.print(node.value + " ");  
//         traverseInorder(node.right);  
//     }  

//     void traverseInorder() 
//     {
//          traverseInorder(root);
//     }  

   

//     public static void main(String args[])  
//     {  
//         Inorder pt = new Inorder();  
//         pt.root = new Node(1);  
//         pt.root.left = new Node(2);  
//         pt.root.right = new Node(3);  
//         pt.root.left.left = new Node(4);  
//         pt.root.left.right = new Node(5);  
//         pt.root.right.left = new Node(6);  
//         pt.root.right.right = new Node(7);  
        
//         System.out.println();  
//         pt.traverseInorder();  
//         System.out.println();  


//         pt.inorderIterative(null);

        
//     }  
// } 
class Node{
    int data;
    Node left,right;


    public Node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
 }

 class InorderTraversal{

    //Recursive Approach
     void traversal(Node root){
        if(root==null){
            return;
        }

        traversal(root.left);
        System.out.print(root.data+ " ");
        traversal(root.right);
     }


     //DFS Iterative approach
     ArrayList<Integer>  dfsInorderTraveersal(Node root ){

        ArrayList<Integer> result= new ArrayList<>();
        Stack<Node> st = new Stack<>();

        while (!st.isEmpty()  ||  root!=null) {

            while(root!=null){
                st.push(root);
                root= root.left;
            }
            root= st.pop();
            result.add(root.data);
            root= root.right;

        }
        // System.out.print(result+" ");
        return result;

     }
 }

 class Inorder{

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);

        InorderTraversal ino = new InorderTraversal();

        System.out.println("Recursive approach");
        ino.traversal(root);
        System.out.println();

        //for iterative
        System.out.println("Iterative approach");
        ArrayList<Integer> ans = ino.dfsInorderTraveersal(root);
        
        System.out.println(ans);
       

         
     }
 }


