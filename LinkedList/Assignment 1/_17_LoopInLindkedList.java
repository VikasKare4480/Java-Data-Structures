import java.util.HashSet;

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
            System.out.println("Node added");
        }
    }

    boolean havingLoop() {

        if(head == null) {

            System.out.println("List is empty");
            return false;
        }
        
        HashSet<Node> hs = new HashSet<>();

        Node temp = head;

        while (temp.next != null) {

            if(hs.contains(temp.next)) {

                return true;
            }
            hs.add(temp.next);
            temp = temp.next;
        }
        return false;
    }

    void printLL() {

        if(head == null) {

            System.out.println("List is empty");

        }else {

            Node temp = head;

            while (temp != null) {

                System.out.print(" " + temp.data);
                temp = temp.next;
            }
        }
     }

}

public class _17_LoopInLindkedList {
    
    public static void main(String[] args) {

        ListOperations ll = new ListOperations();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);

        ll.printLL();
        ll.addNode(10);
        ll.printLL();

        Node temp = ll.head;

        while (temp.next != null) {
            
            temp = temp.next;
        }

        temp.next = ll.head.next.next;

        System.out.println();
        System.err.println("List have loop or not : " + ll.havingLoop());
    }
}
