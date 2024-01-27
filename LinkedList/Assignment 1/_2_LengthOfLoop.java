import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head = null;

    Node addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Node is added at first");
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Node added at last");
        }
        return newNode;
    }

    int loopLength() {
        int length = 0;
        Node slowPointer = head;
        Node fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return nodeCount(slowPointer);
            }
        }

        return length;
    }

    int nodeCount(Node startOfLoop) {
        int nodes = 1; // Initialize to 1 as startOfLoop is already one node

        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else {
            Node temp = startOfLoop;

            while (temp.next != startOfLoop) {
                nodes++;
                temp = temp.next;
            }
        }

        return nodes;
    }
    
    void printSLL() {

        Node temp = head;

        while (temp.next != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;  
        }

        System.out.println(temp.data);
    }
}

class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = ll.addNode(10);
        head.next = ll.addNode(20);
        head.next.next = ll.addNode(30);
        head.next.next.next = ll.addNode(40);
        head.next.next.next.next = ll.addNode(50);
        ll.printSLL();
        head.next.next.next.next.next = head.next;

        System.out.println("LoopNode Counts: " + ll.loopLength());
    }
}
