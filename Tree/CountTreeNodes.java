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

        if(root.equals(null)) {

            return 0;
        }

        int leftNodeCount = countNodes(root.left);

        int rightNodeCount = countNodes(root.right);

        return 1 + leftNodeCount + rightNodeCount;

        
        // if (root != null) {

        //     nodeCount++;
        //     countNodes(root.left);
        //     countNodes(root.right);
        // }else {

        //     // if root node is null and doesnot contains any node
        //     return;
        // }
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        countNodes(root);
        System.out.println("nodeCount -> " + countNodes(root));
        // System.out.println("nodeCount -> " + nodeCount);
    }
}
