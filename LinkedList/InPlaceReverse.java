import java.util.Scanner;

class Node {

    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class  ListOperations {

    Node head = null;

    void addFirst(int data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            System.out.println("Node is added at the First");
            
        }else {

            newNode.next = head;
            head = newNode;  
            System.out.println("Node is added at First");       
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
            System.out.println("Node added at the Last");
        }
    } 

    // Description : Reverse Linkedlist using iterations

    void reverseListIteratve() {

        if(head == null || head.next == null) {

            return;
        }
        Node prev = null;
        Node curr = head;
        Node forward = null;

        while (curr != null) {

            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;            
        }
        head = prev;
        System.out.println("After reversing LinkeList : ");
        printList();
    }

    void reverseListRecuression(Node prev, Node curr) {

        if(curr == null) {

            head = prev;
            return;
            
        }else {

            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        reverseListRecuression(prev, curr);

    }

    void printList() {

        if(head == null) {

            System.out.println("List is Empty");

        }else {

            Node temp = head;
            
            while (temp.next != null) {

                System.out.print(temp.data + "->"); 
                temp = temp.next;               
            }

            System.out.println(temp.data);
        }

    }

    void nodeCount() {

        int count = 0;
        if(head == null) {

            System.out.println("Linked List is Empty");

        }else  {
            
            Node temp = head;

            while (temp != null) {

                count++;
                temp = temp.next;                
            }
        }

        System.out.println("Nodes in the list are : " + count);
    }
} 
public class InPlaceReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        ListOperations ll = new ListOperations();
        char wantToContinue;
        do {

            System.out.println("1. AddFirst : \n2. AddLast : \n3. Reverse List Iteratitions : \n4. Reverse List with Recursion \n5. Print LinkedList :");
            System.out.print("Enter the choice : ");
            int choice = sc.nextInt();

            int data;
            switch (choice) {

                case 1 :

                    System.out.print("Enter the data to add First : ");
                    data = sc.nextInt();
                    ll.addFirst(data);
                    break;
                
                case 2 :

                    System.out.print("Enter the data to add Last : ");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;
                
                case 3 :

                    ll.reverseListIteratve();
                    break;

                case 4:

                    Node prev = null;

                    ll.reverseListRecuression(prev, ll.head);
                    break;
                
                case 5:

                    ll.printList();
                    break;

                default:
                    System.out.println("No match found enter correct choice");
                    break;
            }

            System.out.print("Do you want to Continue (Y/y): ");
            wantToContinue = sc.next().charAt(0);

        } while (wantToContinue == 'Y' || wantToContinue == 'y');
    }
     
}