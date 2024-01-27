
import java.util.Scanner;
class Node {

    int data;
    Node next;

    Node (int data) {

        this.data = data;
        next = null;
    }
}


class LinkedList {

    Node head = null;

    void addFirst(int data) {
        
        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;

        }else {
            
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int x) {

        Scanner sc = new Scanner(System.in);
        if(x == 0) {

            System.out.println("Enter data to insert : ");
            int data = sc.nextInt();
            addFirst(data);
            return;
        }

        System.out.println("Enter data to insertLast : ");
        int data = sc.nextInt();
        if(head == null) {

            addFirst(data);
        } else {

            Node newNode = new Node(data);

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;    
            }
            temp.next = newNode;
        }
    }
    Node getHead() {

        return head;
    }
}


class Client {

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addLast(0);

        Node temp = ll.getHead();

        while (temp!= null) {

            System.out.println(temp.data);
            temp = temp.next;           
        } 
    }
}