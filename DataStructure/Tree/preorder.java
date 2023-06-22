// Question link --> https://leetcode.com/problems/binary-tree-preorder-traversal/

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
class preorder {  
    Node root;  
    preorder() { 
        root = null; 
    }  

    //for leetCode Solution you can copy this 
    void traversePreorder(Node node)  
    {  
        if (node == null)  
            return;  
        System.out.print(node.value + " ");  
        traversePreorder(node.left);  
        traversePreorder(node.right);  
    }  

    void traversePreorder() 
    {
         traversePreorder(root);
    }  
    public static void main(String args[])  
    {  
        preorder pt = new preorder();  
        pt.root = new Node(1);  
        pt.root.left = new Node(2);  
        pt.root.right = new Node(3);  
        pt.root.left.left = new Node(4);  
        pt.root.left.right = new Node(5);  
        pt.root.right.left = new Node(6);  
        pt.root.right.right = new Node(7);  
        
        System.out.println();  
        pt.traversePreorder();  
        System.out.println();  
    }  
} 
