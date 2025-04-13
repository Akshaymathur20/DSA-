// package LevelOrderTraversel;


/*
 * First is level order traversal
 *        let imagin akshay we have tree  
 *                             3
 *                          9     20
 *                              15   7
 *  approach
 *        output --> [[3],[9,20],[15,7]]
 * 
 * Since we know : The root node is at level 0 because it has no parents
 * 
 *      
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    int data;
    Node left,right;


    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class levelOrderTraversel{
  
     public ArrayList<ArrayList<Integer>> levelOrder(Node root){

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        if(root==null) return new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);


        while (!q.isEmpty()) {
            int size=q.size();

            ArrayList<Integer> result= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                result.add(current.data);

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

              ans.add(result);
              
        }
        // Collections.reverse(ans);
        return ans;


     }

     //FollowUp questions

     /* Find the average of level orderTraversal */

     public ArrayList<Double> levelOrderAverage(Node root){

        ArrayList<Double> ans= new ArrayList<>();

        if(root==null) return new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);


        while (!q.isEmpty()) {
            int size=q.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                // result.add(current.data);
                sum+=current.data;

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

              ans.add(sum/size);
        }
        return ans;


     }



     //Follow up qestion to find the zigzel level order traverlsal

     public ArrayList<ArrayList<Integer>> ZigZaglevelOrder(Node root){

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        if(root==null) return new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean isLevelOdd= false;
        while (!q.isEmpty()) {
            int size=q.size();

            ArrayList<Integer> result= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                result.add(current.data);

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

            if(isLevelOdd){
                Collections.reverse(result);
            }
            ans.add(result);
            isLevelOdd= !isLevelOdd;
              
        }
      
        return ans;


     }

     

}
public class LevelOrder {


    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right= new Node(20);
        root.right.left= new Node(15);
        root.right.right= new Node(7);

        Scanner sc = new Scanner(System.in);

         


    levelOrderTraversel lev = new levelOrderTraversel();

        //LevelOrderTraversels
        ArrayList<ArrayList<Integer>> result = lev.levelOrder(root);
        System.out.println(result);

        //average sum of levels

        ArrayList<Double> ans = lev.levelOrderAverage(root);
        System.out.println(ans);

        //zigzaglevel order traversal

        ArrayList<ArrayList<Integer>> res= lev.ZigZaglevelOrder(root);
        System.out.println(res);


        //vertical order traversal
    }
    
}
