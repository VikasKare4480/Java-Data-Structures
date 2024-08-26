import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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

    // Helper Method to count the nodes of Tree
    int countNodes(Node root) {
        
        if(root == null) {

            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Helper Method
    // Sum of Tree Nodes
    int sumOfTreeNodes(Node root) {

        if (root == null) {
            
            return 0;
        }
        return root.data + sumOfTreeNodes(root.left) + sumOfTreeNodes(root.right);
    }

    // Heleper method to get Height of the Binary Tree
    int heightOfBianryTree(Node root) {
        
        if(root == null) {

            return 0;
        }
        return Math.max(heightOfBianryTree(root.left), heightOfBianryTree(root.right)) + 1;
    }

    // A Helper method to for printing the level order traversal
    public void printLeverOrder(Node root) {

        if(root == null) {

            return;
        }
        System.out.println(root.toString());

        Queue<Node> nodesQueue = new LinkedList<Node>();
        nodesQueue.add(root);
        nodesQueue.add(null);

        while (!nodesQueue.isEmpty()) {

            Node current = nodesQueue.remove();

            if(current == null) {

                System.out.println();
                if(nodesQueue.isEmpty()) {

                    break;
                }else {

                    nodesQueue.add(null);
                }
            }else {

                System.out.print(current.data + " ");

                if(current.left != null) {

                    nodesQueue.add(current.left);
                }

                if(current.right != null) {

                    nodesQueue.add(current.right);
                }
            }
        }
    }

    // A main method which executes first
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TreeOperations tops = new TreeOperations();

        Node root = new Node(1);
        Node rootCopy = root;
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Get the NodeCount
        int nodeCount = tops.countNodesWithoutRecursion(root);
        System.out.println("Nodes Count -> " +  nodeCount);

        // These are NON-RECURSIVE Methods
        // Pre-Order Traversal 
        tops.preOrderTraversal(root);

        // InOrder Traversals 
        // Status -> Incomlete
        // tops.inOrderTraversal(root);

        // postOrder Traversals
        // Status -> InComplete
        // tops.postOrderTraversal(root);

        // Count Nodes of Tree
        System.out.println();
        int nodeCount1 = tops.countNodes(root);
        System.out.println("nodeCount -> " + nodeCount1);

        // Get sum of Tree nodes
        int nodeSum = tops.sumOfTreeNodes(root);
        System.out.println("Sum Of Tree Nodes - > " + nodeSum);

        // get the height of the Binary Tree
        int height = tops.heightOfBianryTree(root);
        System.out.println("Height of Binary Tree -> " + height);

        // print the node in levelOrderTraversal -> Breath First level
        tops.printLeverOrder(rootCopy);

        sc.close();
    }
}