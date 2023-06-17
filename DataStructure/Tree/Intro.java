package DataStructure.Tree;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Introduction of Tree ");

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
    }   


} 
class Node{
    int data;
    Node left;
    Node right;

    public Node(key){
        data = key;
    }
};
