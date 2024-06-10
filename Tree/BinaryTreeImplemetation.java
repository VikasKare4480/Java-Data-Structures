
import java.util.Scanner;
class Node {

    int data;
    Node left, right;
    Node(int data) {

        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeImplemetation {

    Scanner sc = new Scanner(System.in);
    private Node createBianryTree() {

        System.out.print("Enter Data for Node : ");
        int data = sc.nextInt();

        Node newNode = new Node(data);
        System.out.print("Do you want to addd node to Left of " + newNode.data + " : ");
        char left = sc.next().charAt(0);
        if(left == 'y' || left == 'Y') {

            newNode.left = createBianryTree();
        }

        System.out.print("Do you want to Add Node to Right of " + newNode.data + " : ");
        char right = sc.next().charAt(0);

        if(right == 'y' || right == 'Y') {
            
            newNode.right = createBianryTree();
        }
        return newNode;
    }

    private void preOrderTreeTraversal(Node root) {

        if(root != null) {

            System.out.print(root.data + " ");
            preOrderTreeTraversal(root.left);
            preOrderTreeTraversal(root.right);
        }
        return;
    }

    private void inOrderTreeTraversal(Node root) {

        if(root != null) {

            inOrderTreeTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTreeTraversal(root.right);
        }
    }

    private void postOrderTreeTRaversal(Node root) {

        if(root != null) {

            postOrderTreeTRaversal(root.left);
            postOrderTreeTRaversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Node root = null;
        BinaryTreeImplemetation bt = new BinaryTreeImplemetation();
        root = bt.createBianryTree();


        // Tree Traversal Techniques

        // Pre-order Tree Traversal
        System.out.print("Preorder Tree Traversal : ");
        bt.preOrderTreeTraversal(root);

        // In-order Tree Traversal
        System.out.print("Inorder Tree Traversal : ");
        bt.inOrderTreeTraversal(root);

        // Post-order Tree Traversal 
        System.out.print("Postorder Tree Traversal : "); 
        bt.postOrderTreeTRaversal(root);

    }
}
