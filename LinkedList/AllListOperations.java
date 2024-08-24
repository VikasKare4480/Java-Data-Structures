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
        System.out.print("After reversing LinkeList : ");
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

    void middleOfTheListSimple() {

        int nodes = nodeCount();
        
        int count = 0;

        Node temp = head;

        while (count != nodes / 2) {

            count++;
            temp = temp.next;            
        }

        System.out.println("Middle Node is : " + temp.data);
    }

    void middleOfTheListFastForward() {

        if(head == null) {

            return;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null) {

            fast = fast.next;
            
            if(fast != null) {

                fast = fast.next;
            }
            slow = slow.next;
        }

        System.out.println("Middle Node is : " + slow.data);

    }

    int nodeCount() {

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
        System.out.println("Nodes in list are : " + count);
        return count;
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
} 
public class AllListOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        ListOperations ll = new ListOperations();
        char wantToContinue;
        do {

            System.out.println("1. AddFirst : \n2. AddLast : \n3. Reverse List with Iteratition : \n4. Reverse List with Recursion : \n5. Print List :  \n6. Middle Of List Simple : \n7. Middle of the List FastForward : \n8. Node Count : ");

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

                case 4 :

                // for recursion 
                    Node prev = null;
                    ll.reverseListRecuression(prev, ll.head);
                    System.out.print("After reversing List : ");
                    ll.printList();
                    break;
                
                case 5 :

                    ll.printList();
                    break;

                case 6 :

                    ll.middleOfTheListSimple();
                    break;

                case 7 : 

                    ll.middleOfTheListFastForward();
                    break;

                case 8 : 

                    ll.nodeCount();
                    break;

                default:
                    System.out.println("No match found enter correct choice");
                    break;
            }


            System.out.print("Do you want to Continue (Y/y): ");
            wantToContinue = sc.next().charAt(0);

        } while (wantToContinue == 'Y' || wantToContinue == 'y');
        sc.close();
    }
     
}