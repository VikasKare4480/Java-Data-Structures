
import java.util.Scanner;

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {

        this.data = data;
        prev = null;
        next = null;
    }
}

class DLList {

    Node head = null;

    void addFirst(int data) {

        Node newNode = new Node(data);
        if(head == null) {

            head = newNode; 
            System.out.println("Node added at the first");
        }else {

           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           System.out.println("Node is added to first");
        }
    }

    void addLast(int data) {


        if(head == null) {

            addFirst(data);
        }else {

            Node newNode = new Node(data);

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;                
            }
            temp.next = newNode;
            newNode.prev = temp;
            System.out.println("Node is added at the end");
        }
    }

    void addAtPos(int data, int pos) {

        if(pos < 0 || pos > nodeCount()) {

            System.out.println("Enter the write choice ");
            return;
        }
        if(pos == 1) {

            addFirst(data);

        }else if(pos == nodeCount()) {

            addLast(data);
        }else {

            Node newNode = new Node(data);

            Node temp = head;

            while (pos - 2 != 0) {

                temp = temp.next;
                pos--;                
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }

    }

    int nodeCount() {

        int nodes = 0;
        Node temp = head;

        while (temp.next != null) {
            
            nodes++;
            temp = temp.next;
        }
        return nodes;
    }

}
class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DLList dll = new DLList();

        char ch;
        do {

            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPos");
            System.out.print("Enter the Choice : ");
            int choice = sc.nextInt();
            int data;
            switch (choice) {
                
                case 1 :    
                    System.out.print("Enter data to insert : ");
                    data = sc.nextInt();
                    dll.addFirst(data);
                    break;

                case 2 :
                    System.out.println("Enter data to add last : ");
                    data = sc.nextInt();
                    dll.addLast(data);
                    break;

                case 3 :

                    System.out.print("Enter the data : ");
                    data = sc.nextInt();
                    System.out.print("Enter the position : ");
                    int pos = sc.nextInt();
                    dll.addAtPos(data, pos);
                    break;

                default:

                    System.out.println("Enter valid choice");
                    break;
            }

            System.out.print("Do you want to continue y/Y : ");
            ch = sc.next().charAt(0);

        }while(ch == 'y' || ch == 'Y');

        sc.close();
    }
}
