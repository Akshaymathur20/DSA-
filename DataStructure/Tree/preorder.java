// Question link --> https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left,right;


    public Node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
 }

 class PreorderTraversal{

    //Recursive Approach
     void traversal(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+ " ");
        traversal(root.left);
        traversal(root.right);
     }


     //DFS Iterative approach
     ArrayList<Integer>  dfsPreorderTraveersal(Node root ){

        ArrayList<Integer> result= new ArrayList<>();

        if(root==null){
            return result;
        }
        
        Stack<Node> st = new Stack<>();
        st.add(root);
        while (!st.isEmpty()) {

            root=st.pop();
            result.add(root.data);
        
            if(root.right!=null){
                st.add(root.right);
            }
            
           if(root.left!=null){
               st.add(root.left);
           }
        }
        // System.out.print(result+" ");
        return result;

     }
 }

 class preorder{

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);

        PreorderTraversal pre = new PreorderTraversal();

        System.out.println("Recursive approach");
        pre.traversal(root);
        System.out.println();

        //for iterative
        System.out.println("Iterative approach");
        ArrayList<Integer> ans = pre.dfsPreorderTraveersal(root);
        
        System.out.println(ans);
       

         
     }
 } 
