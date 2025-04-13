// Question link --> https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.ArrayList;
import java.util.Collections;
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

 class PostorderTraversal{

    //Recursive Approach
     void traversal(Node root){
        if(root==null){
            return;
        }

        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data+ " ");
     }


     //DFS Iterative approach
     ArrayList<Integer>  dfsPostorderTraveersal(Node root ){

        ArrayList<Integer> result= new ArrayList<>();
        Stack<Node> st = new Stack<>();

        while (!st.isEmpty() || root!=null) {

            if(root!=null){
                st.add(root);
                root=root.left;
            }else{

                Node temp = st.peek().right;

                if(temp==null){
                    temp = st.pop();
                    result.add(temp.data);
                    while(!st.isEmpty() && temp== st.peek().right){
                        temp= st.pop();
                        result.add(temp.data);
                    }
                }else{
                    root=temp;
                }
            }
        }
        // System.out.print(result+" ");
        return result;

     }

     //postorder from preorder

     ArrayList<Integer>  PostorderTraveersal(Node root ){

        ArrayList<Integer> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        
        Stack<Node> st = new Stack<>();
        st.add(root);
        while (!st.isEmpty()) {

            root=st.pop();
            result.add(root.data);
        
            if(root.left!=null){
                st.add(root.left);
            }
            if(root.right!=null){
                st.add(root.right);
            }
            
        }
        // System.out.print(result+" ");
        Collections.reverse(result);
        return result;

     }
 }

 class postorder{

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);

        PostorderTraversal post = new PostorderTraversal();

        System.out.println("Recursive approach");
        post.traversal(root);
        System.out.println();

        //for iterative
        System.out.println("Iterative approach");
        ArrayList<Integer> ans = post.dfsPostorderTraveersal(root);
        
        System.out.println(ans);


        System.out.println("Preorder to postorder");

        ArrayList<Integer> res = post.PostorderTraveersal(root);
        System.out.println(res);
       

         
     }
 } 
