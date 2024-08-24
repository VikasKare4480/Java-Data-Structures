
class Node {

    int data;
    Node next = null;   

    Node(int data) {

        this.data = data;
    }
}

class LinkedList {

    Node head = null;

    void addLast(int data) {

        Node newNode = new Node(data);
        if(head == null) {

            head = newNode;
        }else {

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;               
            }

            temp.next = newNode;           
        }
        System.out.println("Node is added in the LinkedList");
    }

    void printLinkedList() {

        if(head == null) {

            System.out.println("List is empty");
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

            System.out.println("Head is null List is empty");
        }else {

            Node temp = head;

            while (temp != null) {
                
                count++;
                temp = temp.next;
            }

            System.out.println("Nodes in the list are : " + count);
        }
    }
}
public class MiddleOfLList {

    public static void main(String[] args) {

        
    }
}