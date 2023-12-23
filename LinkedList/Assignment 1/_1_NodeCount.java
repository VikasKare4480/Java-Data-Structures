
import java.util.Scanner;

class Node {

        int data;
        Node next = null;

        Node(int data) {

            this.data = data;
        }
}

class ListOperations {

        Node head = null;

        void addNode(int data) {

            Node newNode = new Node(data);

            if(head == null) {

                head = newNode;
                System.out.println("Node added");
            }else {

                Node temp = head;

                while (temp.next != null) {

                    temp = temp.next;                    
                }
                temp.next = newNode;
                System.out.println("Node added at the end");
            }
        }

        int countNodes() {

            int nodes = 0;

            if(head == null) {

                return nodes;

            }else {

                Node temp = head;

                while (temp.next != null) {
                    
                    nodes++;
                    temp = temp.next;
                }
            }
            return ++nodes;
        }
}

public class _1_NodeCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListOperations ll = new ListOperations();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);

        System.out.println("Node Count is : " + ll.countNodes());
    }
}
