import java.util.Scanner;
import java.util.Stack;

// Node Structure 
class Node  {

    int data;
    Node left, right;

    Node(int data) {

        this.data = data;
        left = right = null;
    }
}

public class TreeOperations {

    // Helper method to count the nodes In the Binary Tree -> Using Stack
    int countNodesWithoutRecursion(Node root) {

        if(root == null) {

            return 0;
        }
        int nodeCount = 0;

        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {

            Node poppedNode = nodeStack.pop();
            nodeCount++;

            if(poppedNode.left != null) {

                nodeStack.push(poppedNode.left);
            }

            if(poppedNode.right != null) {

                nodeStack.push(poppedNode.right);
            }
        }

        return nodeCount;

    }

    // PreOrderTraversal

    void preOrderTraversal(Node root) {

        if(root == null) {

            return;
        }

        Stack<Node> nodesStack = new Stack<Node>();
        nodesStack.push(root);

        while (!nodesStack.isEmpty()) {

            Node current = nodesStack.pop();
            System.out.print(current.data + " -> ");

            if(current.right != null) {

                nodesStack.push(current.right);
            }

            if(current.left != null) {

                nodesStack.push(current.left);
            }
        }
    }

    // A Helper method to Pint the Tree in InOrder Way
    void inOrderTraversal(Node root) {
        
        if(root == null) {

            return;
        }

        Stack<Node> nodesStack = new Stack<>();
        Node current = root;

        while (!nodesStack.isEmpty()) {

            if(current.right != null) {

                nodesStack.push(current.left);
            }

            if(current.left != null) {

                nodesStack.push(current.left);
            }

        }
    }

    void postOrderTraversal(Node root) {

        if(root == null) {

            return;
        }
    }

    // A main method which executes first
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TreeOperations tops = new TreeOperations();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Get the NodeCount
        int nodeCount = tops.countNodesWithoutRecursion(root);
        System.out.println("Nodes Count -> " +  nodeCount);

        // This are NON-RECURSION Methods

        // Pre-Order Traversal 
        tops.preOrderTraversal(root);

        // postOrder Traversals


        // postOrder Traversals
        sc.close();
    }
}