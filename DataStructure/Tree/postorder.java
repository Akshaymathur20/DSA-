// Question link --> https://leetcode.com/problems/binary-tree-postorder-traversal/

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
class postorder {  
    Node root;  
    postorder() { 
        root = null; 
    }  

    //for leetCode Solution you can copy this 
    void traversePostorder(Node node)  
    {  
        if (node == null)  
            return;  
         traversePostorder(node.left);  
         traversePostorder(node.right);  
        System.out.print(node.value + " ");  
    }  

    void traversePostorder() 
    {
         traversePostorder(root);
    }  
    public static void main(String args[])  
    {  
        postorder pt = new postorder();  
        pt.root = new Node(1);  
        pt.root.left = new Node(2);  
        pt.root.right = new Node(3);  
        pt.root.left.left = new Node(4);  
        pt.root.left.right = new Node(5);  
        pt.root.right.left = new Node(6);  
        pt.root.right.right = new Node(7);  
        
        System.out.println();  
        pt.traversePostorder();  
        System.out.println();  
    }  
} 
