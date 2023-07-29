// Question link --> https://leetcode.com/problems/binary-tree-inorder-traversal/

class Node {  
    public int value;  
    public Node left;  
    public Node right;  
    public Node(int data)  
    {  
        value = data;  
        left = right = null;  
    }  
}  
class Inorder {  
    Node root;  
    Inorder() { 
        root = null; 
    }  

    //for leetCode Solution you can copy this 
    void traverseInorder(Node node)  
    {  
        if (node == null)  
            return;  
        traverseInorder(node.left);  
        System.out.print(node.value + " ");  
        traverseInorder(node.right);  
    }  

    void traverseInorder() 
    {
         traverseInorder(root);
    }  


    public static void main(String args[])  
    {  
        Inorder pt = new Inorder();  
        pt.root = new Node(1);  
        pt.root.left = new Node(2);  
        pt.root.right = new Node(3);  
        pt.root.left.left = new Node(4);  
        pt.root.left.right = new Node(5);  
        pt.root.left.left.left = new Node(6);  
        pt.root.left.left.right = new Node(7);  
        
        System.out.println();  
        pt.traverseInorder();  
        System.out.println();  
    }  
} 

