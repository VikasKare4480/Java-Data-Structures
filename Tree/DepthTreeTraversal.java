class Node {

    int data;
    Node left, right;
    Node(int data) {

        this.data = data;
        left = right = null;
    }
}

public class DepthTreeTraversal {

    private static void printTree(Node root) {

        //  preorderTraversal
        if(root != null) {

            System.out.print(root.data +  " ");
            printTree(root.left);
            printTree(root.right);
        }else {

            return;
        }
    }

    public static void depthFirstTraversal(Node root) {


        if(root != null) {
            
            
        }else {

            System.out.println("Root is null cant be empty");
            return;
        }
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        System.out.println("Binary Tree Created Succesfully");
        System.out.print("Preorder Tree Traversal -> ");
        DepthTreeTraversal.printTree(root);
        return;
    }
}
