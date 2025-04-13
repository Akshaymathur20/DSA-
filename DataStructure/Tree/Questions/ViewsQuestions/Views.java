// package Questions.ViewsQuestions;

/*
 * Their could be mulitple views of a  binary tree here view means from the angle we can see the nodes of tree
 * left view, right, top view, bottom view are common --> we could have a follow up question based on this 
 * example--> left view +rightView , rightview to leftview , topview to bottom view, boundary traversal etc.
 * But the concept here is going to be used is one you have to understand the apporach of the solution and I can here tacke any prob
 * problem if we have in future after understanding the concepts of view , thoro understanding of traversal
 * 
 *                   3
 *                9    20 
 *                   15   7
 * 
 * LeftView---> 3,9,25(if they ask from the root), or 9,3,15
 * RightView = 3,20,7 or 7,20,3
 * BottomView => 9,15,7
 * Top View => 3,8,20
 * 
 * LeftTORight --> 9,3,20,7
 * 
 */
import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data ;
    Node left;
    Node right;

    Node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
}

class ViewsQuestions{

    int maxxLevel =0;

    //LeftView of binary tree
    void leftView(Node root,int level, ArrayList<Integer> result){

        if(root==null) return;
        
        if(maxxLevel<level){
            result.add(root.data);
            maxxLevel=level;
        }

        leftView(root.left, level+1, result);
        leftView(root.right, level+1, result);
    }

    //We can optimise it in space coplexityy by just removing arraylist

    //Right View
    void rightView(Node root,int level, ArrayList<Integer> result){

        if(root==null) return;
        
        if(maxxLevel<level){
            result.add(root.data);
            maxxLevel=level;
        }

        rightView(root.right, level+1, result);
        rightView(root.left, level+1, result);
    }

    //again follow up --> what if you have to take the boundary of tree start from rroot and back to their


}

class BoundaryTraversel{
    
    int maxxLevel=0;

    void LeftView(Node root, int level , ArrayList<Integer>result){

        if(root==null || (root.left==null && root.right==null)){
            return;
        }

        if(maxxLevel<level){
            result.add(root.data);
            maxxLevel=level;
        }

        LeftView(root.left,level+1,result);

    }

    void addLeaves(Node root,ArrayList<Integer>result){

        if(root==null) return;

        if(root.left==null && root.right==null){
            result.add(root.data);
        }

        addLeaves(root.left, result);
        addLeaves(root.right, result);
    }

    void RightView(Node root, int level , ArrayList<Integer>result){

        if(root==null || (root.left==null && root.right==null)){
            return;
        }

        
        RightView(root.right,level+1,result);
        if(maxxLevel<level){
            result.add(root.data);
            maxxLevel=level;
        }


    }
}
public class Views {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.left = new Node(6);
        root.right.right= new Node(7);
        
        ViewsQuestions vie = new ViewsQuestions();

          //LeftView
    //    ArrayList<Integer> result = new ArrayList<>();
    //     vie.leftView(root, 1, result);
    //     for(Integer integer:result){
    //         System.out.print(integer+ " ");
    //     }
        //optimising in space complexity
        // vie.leftView1(root, 1);


        //Right View
        // ArrayList<Integer> res = new ArrayList<>();
        // vie.rightView(root, 1, res);
        // for(Integer integer:res){
        //     System.out.print(integer+ " ");
        // }

        //Followup --> Can you print me the left and rght view of the binary tree --> not interested in bottom part

        //  vie.maxxLevel=0;
        //  ArrayList<Integer> result = new ArrayList<>();
        //  vie.leftView(root.left, 1, result);
        // //  Collections.reverse(result);
        //  vie.maxxLevel=0;
        //  vie.rightView(root, 1, result);


        //  for(Integer integer:result){
        //     System.out.print(integer+ " ");
        //  }


        //Follow Up for boundary Traversal from root-->left-->right
           
        BoundaryTraversel bo= new BoundaryTraversel();
        bo.maxxLevel=0;
        ArrayList<Integer> result = new ArrayList<>();
        bo.LeftView(root, 1, result);
        bo.addLeaves(root, result);
        bo.maxxLevel=0;
        bo.RightView(root, 1, result);

        //Follow Up for boundary Traversal from root-->right-->left
        // Collections.reverse(result);


        for(Integer integer:result){
            System.out.print(integer+ " ");
        }
        


    }
    
}
