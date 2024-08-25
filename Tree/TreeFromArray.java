import java.util.Scanner;

public class TreeFromArray {

    static int arrayIndex = -1;

    static class Node {

        int data;
        Node left, right;
        Node(int data) {

            this.data = data;
            left = right = null;
        }
    }

    private static int countNodes(Node root) {

        if(root == null) {
            
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private static Node createTreeFromArray(int[] nodesArray) {

        arrayIndex++;

        // Base Condition
        if(nodesArray[arrayIndex] == -1) {

            return null;
        }

        Node newNode = new Node(nodesArray[arrayIndex]);
        newNode.left = createTreeFromArray(nodesArray);
        newNode.right = createTreeFromArray(nodesArray);

        return newNode;
    }

    // Helper Method
    // Prints the BT in the preOrder Way (+AB)
    private static void printTree(Node root) {
        
        if(root != null) {
            
            System.out.print(root.data + " ");
            printTree(root.left);
            printTree(root.right);
        }

    }


    // Helper Method to Print the Array

    private static void printArray(int[] array) {

        System.out.println("Array elements -> ");
        for (int element : array) {

            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nodesArray = new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        printArray(nodesArray);
        Node treeFromArray = createTreeFromArray(nodesArray);
        System.out.print("Tree From Array -> ");
        printTree(treeFromArray);
        System.out.println();
        System.out.println("Node Count -> " + countNodes(treeFromArray));
        sc.close();
    }
}
