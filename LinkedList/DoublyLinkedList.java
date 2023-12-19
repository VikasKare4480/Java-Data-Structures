
import java.util.Scanner;

class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {

        this.data = data;
    }
}

class DoublyLinkedList {

    Node head = null;

    // Description : adds the node to the start of the DLL
    void addFirst(int data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            System.out.println("Node is added at the first place");
            printDLL();

        }else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println("Node is added at first place");
            printDLL();
        }
    }

    // Description : adds the node to the last of the linkedList

    void addLast(int data) {

          Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            System.out.println("Node is added at first place");

        }else {

            Node temp = head;

            while (temp.next != null) {

                temp.next = temp;
            }

            temp.next = newNode;
            newNode.prev = temp; // OR temp.next.prev = temp

            System.out.println("Node added at the last succesfully ");
        }

    }

    void addAtPos(int data, int pos) {

        if(pos <= 0 || pos > nodeCount() + 1) {

            System.out.println("Enter the valid position");
            return;
        }

        if (pos == 1) { 
            
            addFirst(data);

        }else if(pos == nodeCount() + 1) {

            addLast(data);

        }else {
            
            Node newNode = new Node(data);

            Node temp = head;
            
            while (pos - 2 != 0) {

                temp = temp.next;
                pos--;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
            System.out.println("Node inserted succesfully");
        }
    }

    void deleteFirst() {

        if(head == null) {

            System.out.println("List is empty");
        }else if(nodeCount() == 1) { 

            head = null;
            System.out.println("Node is deleted");
        } else {

            head = head.next;
            head.prev = null;
            System.out.println("Node deleted succesfully");
        }
    }

    void deleteLast() {

        if(head == null) {

            System.out.println("List is empty");
        } else if(nodeCount() == 1) {

            deleteFirst();
        }else {

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }

            temp.prev.next = null;
            temp.prev = null;
        }
    }

    void deleteAtPos(int pos) {

        if(pos <=0 ||  pos >= nodeCount() + 1) {

            System.out.println("Enter the valid position to delete");
            return;
        }else if( pos == 1) {
            
            deleteFirst();
        }else if(pos == nodeCount()) {

            deleteLast();
        }else { 

            Node temp = head;

            while(pos - 2 != 0) {

                temp = temp.next;
                pos--;
            }

            temp.next = temp.next.next; 
            temp.next.prev = temp;
        }
    }

    // Description : prints the linkedList 
    void printDLL() {

        if(head == null) {

            System.out.println("LinkedList is empty");
        }else {

            Node temp = head;

            while(temp.next != null) {

                System.out.print(temp.data + "->");
                temp = temp.next;                
            }
            System.out.println(temp.data);
        }
    }

    // Description : Counts the nodes in the linkdlist
    int nodeCount() {

        int count = 0;

        if(head == null) {

            System.out.println("List is empty");
            return 0;

        }else  {

            Node temp = head;

            while (temp != null) {

                count++;
                temp = temp.next;                
            }
        }
        return count;
    }
}

class DLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

       char ch;
        do {

            System.out.println("1. Add Node to first Place : ");
            System.out.println("2. Add Node to last Place : ");
            System.out.println("3. Add Node at position : ");
            System.out.println("4. delete first Node : ");
            System.out.println("5. delete last Node : ");
            System.out.println("6. delete Node at any Position : ");
            System.out.println("7. print the Doubly linked list : ");
            System.out.println("8. Count the Nodes in the linked list : ");

            System.out.print("Enter choice : ");

            int choice = sc.nextInt();
            
            switch(choice) {

                case 1 : {

                    System.out.print("Enter the data to add first : ");
                    int data = sc.nextInt();
                    dll.addFirst(data);
                    System.out.print("After adding the data at first position : ");
                    dll.printDLL();
                }
                break;

                case 2 :  {

                    System.out.print("Enter the data to add last : ");
                    int data = sc.nextInt();
                    dll.addLast(data);
                    System.out.print("After adding the data at last postion : ");
                    dll.printDLL();
                    System.out.println();
                }
                break;

                case 3 : {

                    System.out.print("Enter the position : ");
                    int pos = sc.nextInt();
                    System.out.print("Enter the data to insert : ");
                    int data = sc.nextInt();
                    dll.addAtPos(data, pos);
                    break;
                }
                case 4 : {

                    dll.deleteFirst();
                    break;
                }
                case 5 : {  

                    dll.deleteLast();
                    break;
                }
                case 6 : {

                    System.out.print("Enter position to delete : ");
                    int pos = sc.nextInt();
                    dll.deleteAtPos(pos);
                    break;
                }

                case 7 :  {

                    dll.printDLL();
                    break;
                }
        
                case 8 : {

                    int nodes = dll.nodeCount();
                    if(nodes != 0) {

                        System.out.println("Counts of the nodes : " + nodes);
                    }
                    break;
                }

                default : 
                    System.err.println("No match found please reenter the Choice : ");
            }

            System.out.print("Want to Countinue? (Y/y) : ");
            ch = sc.next().charAt(0);

        }while(ch ==  'Y' || ch == 'y');

    }
}
