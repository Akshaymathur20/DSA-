package Implementation;
import java.util.Scanner;

public class BinarySearch {


    public BinarySearch(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    //Insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left  = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
    }
    
}
