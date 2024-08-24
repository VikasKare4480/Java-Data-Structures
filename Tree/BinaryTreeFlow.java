// Binary Tree Flow

import java.util.Scanner;

class Node {

    int data;
    Node left, right;

    Node(int data) {

        this.data = data;
        left = right = null;
    }
    
}

public class BinaryTreeFlow {

    Scanner sc = new Scanner(System.in); 

    void createBianryTree() {

        System.out.println("Enter data to insert in the Node");
        int data = sc.nextInt();
        
    }

    void preOrderTreeTraversal(Node root) {
        
        if(root != null) {

            System.out.println(root.data + " ");
            preOrderTreeTraversal(root.left);
            preOrderTreeTraversal(root.right);
        }
        return;
    }

    void inOrderTreeTraversal(Node root) {
        
        if(root != null) {

            inOrderTreeTraversal(root.left);
            System.out.println(root.data + " ");
            inOrderTreeTraversal(root.right);
        }
        return;
    }

    void postOrderTreeTraversal(Node root) {

        if(root != null) {

            postOrderTreeTraversal(root.left);
            postOrderTreeTraversal(root.right);
            System.out.println(root.data + " ");
        }
    }
    public static void main(String[] args) {

        Node node = null;
        BinaryTreeFlow btf = new BinaryTreeFlow();
        btf.createBianryTree();
    }
}
