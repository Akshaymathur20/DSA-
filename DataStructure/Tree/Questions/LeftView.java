// package Questions;

import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node left,right;
    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// class LeftViewOfTree{
//     int maxLevel = 0;
//     void leftView(Node root,int level){

//         //  1 is tgreateer 0 why 0
//         /* Lets suppose we are at level 0  if this level is greateer the maxlevel then we know we have reached at point where we wanna add the element to the list bsicallyt result.add(root.data) when my level is 2 and maxxlevl is 2 since 2>2 falst so i don't have to add root.dtat */

//         //if the tree is emtpy
//         if(root==null){
//             return;
//         }

//         if(maxLevel<level){     //0<1   1<2
//             // result.add(root.data); //[1,2]
//             System.out.print(root.data+ " ");
//             maxLevel=level;
//         }

//         leftView(root.left, level+1);
//         leftView(root.right, level+1);

//     }
// }

//Followup --> Can you print me the left and rght view of the binary tree --> not interested in bottom part
//  class Tree{
    //     int maxxLevel = 0;
    
    //     void leftView(Node root, int level){
        //         if(root==null){
            //             return;
//         }

//         //bcaise goign down to up 
//         if(maxxLevel<level){    //it wont work becasue we are alredy intialise so this condtition will become false we gonna reverse it 
//             System.out.print(root.data+" ");
//             maxxLevel=level;
//         }

//         leftView(root.left, level+1);
//         // leftView(root.right, level+1);
//     }

//     void rightView(Node root, int level){
    //         if(root==null){
//             return;
//         }

//         //bcaise goign down to up 
//         if(maxxLevel<level){
    //             System.out.print(root.data+" ");
    //             maxxLevel=level;
    //         }
    //         rightView(root.right, level+1);
    //         // rightView(root.right, level+1);
    //     }
    //  }
    
    //so bascially wer have to reverst it so we are bringing list back againg
    
     class Tree{
        int maxxLevel = 0;
        
        void leftView(Node root, int level,ArrayList<Integer> result){
            if(root==null){
                return;
            }
 
            if(maxxLevel<level){
                result.add(root.data);
                maxxLevel=level;
            }
    
            leftView(root.left, level+1,result);
        }
    
        void rightView(Node root, int level,ArrayList<Integer> result){
            if(root==null){
                return;
            }

            if(maxxLevel<level){
                result.add(root.data);
                maxxLevel=level;
            }
            rightView(root.right, level+1,result);
        }
     }


     //again follow up --> what if you have to take the boundary of tree start from rroot and back to their


    //  class Tree{
    //     int maxxLevel = 0;
        
    //     void leftView(Node root, int level,ArrayList<Integer> result){
    //         if(root==null ||  (root.left==null && root.right==null)){
    //             return;
    //         }
 
    //         if(maxxLevel<level){
    //             result.add(root.data);
    //             maxxLevel=level;
    //         }
    
    //         leftView(root.left, level+1,result);
    //     }
    
    //     void rightView(Node root, int level,ArrayList<Integer> result){
    //         if(root==null || (root.left==null && root.right==null)){
    //             return;
    //         }

    //         rightView(root.right, level+1,result);

    //         if(maxxLevel<level){
    //             result.add(root.data);
    //             // maxxLevel=level;
    //         }
    //     }
    //      void addLeaves(Node node, ArrayList<Integer> result){
    //         if(node==null) return;
            
    //         if(node.left==null && node.right==null) result.add(node.data);
            
            
    //         addLeaves(node.left,result);
    //         addLeaves(node.right,result);
    //     }
    //  }
    
    
    
    
    class LeftView {
        
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.left = new Node(6);
        root.right.right= new Node(7);


        //followup 

        Tree tree = new Tree();
        tree.maxxLevel=0;
        ArrayList<Integer> result = new ArrayList<>();
        tree.leftView(root.left, 1,result);
        Collections.reverse(result);
        tree.maxxLevel=0;
        tree.rightView(root, 1,result);

        for(Integer integer:result){
            System.out.print(integer+" ");
        }

        //store the leftView result
        // ArrayList<Integer> result = new ArrayList<>();
      
        //created the instance
        // LeftViewOfTree instance = new LeftViewOfTree();
        // instance.leftView(root, 1 );

        // for(Integer integer:result){
        //     System.out.print(integer+ " ");
        // }
    }
    //Time compelxity in worse case iteratin over all the node O(n)
    //We are not expecting any other 

    //Is there any optimzation can we make 

    //Yes-->  so basicaly why do i have to visit the rightsubtree if inally found a node which i added in the list

    //supoose we are at level 1 if i have encountered a node which has already been added to this result set then I don't even have to visit three oh but i have to visit it because i will not be able to enocunter 6 becuase the readson why i am able to enocunter sixe if i don't do that --> I wouldn't do that 
    //so i don't have an improve time complexity
    //we can optimse the sapce by just rmoving list

    //Follow up ---> Boundary of binary tree 



}
