    class Node {

        int data;
        Node left, right;

        Node(int data) {

            this.data = data;
            left = right = null;
        }
    } 

public class CountTreeNodes {

    static int nodeCount = 0;

    private static int countNodes(Node root) {


        if(root == null) {

            return 0;
        }

        int leftNodeCount = 0;
        int rightNodeCount = 0;
        if(root.left != null) {

            leftNodeCount = countNodes(root.left);
        }

        if(root.right != null) {

            rightNodeCount = countNodes(root.right);
        }

        return 1 + leftNodeCount + rightNodeCount;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("nodeCount -> " + countNodes(root));
    }
}
