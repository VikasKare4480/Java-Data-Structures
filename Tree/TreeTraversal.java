import java.util.Scanner;
class Node {

    int data;
    Node left, right;
    Node(int data) {

        this.data = data;
        left = right = null;
    }
    
}

public class TreeTraversal {

    
    // DFS
    // Pre-Order Tree treversal
    private static void preOrderTreeTraversal(Node root) {

        if(root != null) {
            System.out.print(root.data);
            preOrderTreeTraversal(root.left); 
            preOrderTreeTraversal(root.right);
        }
    }

    // In-Order Tree Treaversal

    private static void inOrderTreeTraversal(Node root) {

        if(root != null) {

            inOrderTreeTraversal(root.left);
            System.out.print(root.data);
            preOrderTreeTraversal(root.right);
        }

    }

    // Post-Order Tree Treaversal

    private static void postOrderTreeTRaversal(Node root) {

        if(root != null) {

            postOrderTreeTRaversal(root.left);            
            postOrderTreeTRaversal(root.right);
            System.out.print(root.data);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tree Functions : ");

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // Preorder Traversal
        System.out.print("Pre_order Tree Traversal : ");
        preOrderTreeTraversal(root);
        System.out.println();

        // Inorder Traversal
        System.out.print("In Order Tree Traversal : ");
        inOrderTreeTraversal(root);
        System.out.println();
        
        //Post-Order Traersal
        System.out.print("Post Order Tree Traversal : ");
        postOrderTreeTRaversal(root);

        sc.close();
    }
}
