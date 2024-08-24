import java.util.Scanner;
public class SinglyLinkedListClient {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        LinkedList ll =  new LinkedList();

        char ch;
        do {

            System.out.println("1. Add Node to first Place : ");
            System.out.println("2. Add Node to last Place : ");
            System.out.println("3. Add Node at position : ");
            System.out.println("4. delete first Node : ");
            System.out.println("5. delete last Node : ");
            System.out.println("6. delete Node at any Position : ");
            System.out.println("7. print the singly linked list : ");
            System.out.println("8. Count the Nodes in the linked list : ");

            System.out.print("Enter choice : ");

            int choice = sc.nextInt();
            
            switch(choice) {

                case 1 : {

                    System.out.print("Enter the data to add first : ");
                    int data = sc.nextInt();
                    ll.addFirst(data);
                    System.out.print("After adding the data at first position : ");
                    ll.pritnSLL();
                }
                break;

                case 2 :  {

                    System.out.print("Enter the data to add last : ");
                    int data = sc.nextInt();
                    ll.addLast(data);
                    System.out.print("After adding the data at last postion : ");
                    ll.pritnSLL();
                    System.out.println();
                }
                break;

                case 3 : {

                    System.out.print("Enter position to add : ");
                    int pos = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the data to add : ");
                    int data = sc.nextInt();
                    ll.addAtPos(pos, data);
                    System.out.print("After adding the data to the positon : ");
                    ll.pritnSLL();
                }
                break;

                case 4 : {

                    System.out.println("deleting the first Node ");
                    ll.deleteFirst();
                    System.out.println("After deletion of the firstNode");
                    ll.pritnSLL();
                    System.out.println();
                }
                break;

                case 5 : {

                    System.out.println("deting the last Node ");
                    ll.deleteLast();
                    System.out.print("List after delting the last node : ");
                    ll.pritnSLL();
                    System.out.println();
                }
                break;

                case 6 : {

                    System.out.print("Enter position to delete the node : ");
                    int pos = sc.nextInt();
                    ll.deleteAtPos(pos);
                    System.out.print("After deletion LinkedList is at position : ");
                    ll.pritnSLL();
                    System.out.println();
                }
                break;

                case 7 :  {

                    ll.pritnSLL();
                }
                break;

                case 8 : {

                    System.out.println("Total Nodes in the Linked List is : " + ll.nodeCount());
                }
                break;

                default : 
                    System.err.println("No match found please reenter the Choice : ");
            }

            System.out.print("Want to Countinue? (Y/y) : ");
            ch = sc.next().charAt(0);

        }while(ch ==  'Y' || ch == 'y');
        sc.close();
    }
}
class Node {

    int data;
    Node next = null;

    Node(int data) {

        this.data = data;
    }
}

class LinkedList {
    
    Node head = null;
        
    void addFirst(int data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            System.out.println( head.data + " added at first");

        }else {

            newNode.next = head;
            head = newNode;
            System.out.println(head.data + " added at first");   
        }
    }

    void addLast(int data) {

        Node newNode = new Node(data);

        if(head == null) {

            addFirst(data);
        }else {

            Node temp = head;
 
            while(temp.next != null) {

                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println(newNode.data + " added to the last");
        }
    }

    void addAtPos(int pos, int data) {

        int nodes = nodeCount();

        if(pos <= 0 || pos > nodes) {

            System.out.println("Enter the valid position to insert less than " + nodeCount());
            return;

        }else if(pos == 1) {

            addFirst(data);
            
        }else if(pos == nodes) {

            addLast(data);
        }else {

            Node newNode = new Node(data);
            Node temp = head;

            while (pos - 2 != 0) {

                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    void deleteFirst() {

        if(head == null) {

            System.out.println("list is empty");
            return;

        }else if(nodeCount() == 1) {

            head = null;
            System.out.println("first node deleted");

        }else {

            head = head.next;  
            System.out.println("first node deleted"); 
        }
    }

    void deleteLast() {

        if(head == null) {

            System.out.println("List is empty ");
            return;

        }else if(nodeCount() == 1) {
            
            head = null;
        }
        else {

            Node temp = head;
            
            while (temp.next.next != null) {
                
                temp = temp.next;   
            }

            temp.next = null;
        }
    }

    void deleteAtPos(int pos) {

        if(pos < 0)  {

            System.out.println("Invalid position. position should not be negative");
            return;
        }

        if(pos == 0) {

            if(head != null) {

                head = head.next;
            }else {

                System.out.println("List is empty");
            }
            return;
        }

        if(head == null) {

            System.out.println("LinkedList is Empty");
        }else if(pos == 1) {

            deleteFirst();
        }else if(pos == nodeCount()) {

            deleteLast();
        }else {

            Node temp = head;

            while (pos - 2 != 0) {

                temp = temp.next;
                pos--;
            }
            temp.next = temp.next.next;
        }
    }

    int nodeCount() {

        int count = 0; 

        if(head == null) {

            System.out.println("Linked list is empty");

        }else {

            Node temp = head;

            while (temp != null) {

                count++;
                temp = temp.next;
            }
        }

        return count;
    }

    void pritnSLL() {

        if(head == null) {

            System.out.println("Linked list is empty");
        }   
        else {

            System.out.print("Linked List : ");

            Node temp = head;

            while (temp.next != null) {

            System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }        
    }   
}




