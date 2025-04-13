// package Questions.OtherQuestions;

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LeetCodeQuestion {

    // Recursive approach to find the minimum depth of a binary tree
    public int minDepth(Node root) {
        if (root == null) {
            return 0;
        }

        // If one of the children is null, consider the depth of the other subtree
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // If both children are non-null, take the minimum depth between them
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        return 1 + Math.min(leftDepth, rightDepth);
    }
/*
 * It’s simpler, quicker to explain, and demonstrates a strong grasp of recursion.
If the interviewer asks for optimization, mention the potential problem of recursion stack overflow in deep trees and proceed to explain the iterative approach.
 */
    // Iterative approach to find the minimum depth of a binary tree
    public int minDepth1(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                // If a leaf node is encountered, return the current depth
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            depth++;
        }
        return depth;
    }
    // Recursive approach to find the minimum depth of a binary tree
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        // If one of the children is null, consider the depth of the other subtree
        if (root.left == null) {
            return 1 + maxDepth(root.right);
        }
        if (root.right == null) {
            return 1 + maxDepth(root.left);
        }

        // If both children are non-null, take the minimum depth between them
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
/*
 * It’s simpler, quicker to explain, and demonstrates a strong grasp of recursion.
If the interviewer asks for optimization, mention the potential problem of recursion stack overflow in deep trees and proceed to explain the iterative approach.
 */
    // Iterative approach to find the minimum depth of a binary tree
    public int maxDepth1(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

        
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            depth++;
        }
        return depth;
    }
}

public class Question {

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        LeetCodeQuestion let = new LeetCodeQuestion();

        // Recursive solution
        int ans = let.minDepth(root);

        // Iterative solution
        int res = let.minDepth1(root);

        System.out.println("Minimum Depth (Recursive): " + ans);
        System.out.println("Minimum Depth (Iterative): " + res);
        // Recursive solution
        int ans1 = let.maxDepth(root);

        // Iterative solution
        int res1= let.maxDepth1(root);

        System.out.println("Maximum Depth (Recursive): " + ans1);
        System.out.println("Maximum Depth (Iterative): " + res1);
    }
}
