import java.util.Scanner;   

class Node {

    int data;
    Node next;
    Node(int data) {

        this.data = data;   
        this.next = null;
    }
}

class SCLinkedList {

    Node head = null;

    void addFirst(Node newNode) {

        if(head == null) {

            head = newNode;
            System.out.println("Added at first");
        }else {

            newNode.next = head;
            head = newNode;
            System.out.println("Node added at first");
        }
    }

    // int countNodes() {

    //     int nodes = 0;
    //     if(head == null) {

    //         return nodes;

    //     }else {

    //         Node temp = head;

    //         while (temp.next != temp) {
                
    //         }
    //     }
    // }

    void printSCLL() {

        if(head == null) {

            System.out.println("Head is null so linkedlist is empty");
            return;
        }else {

            Node temp = head;

            do {

                temp = temp.next;
                System.out.print(temp.next != head.next ? temp.data + ("->") : temp.data);
            }while(temp.next != head.next);
        }
    }

    void addLast(Node newNode) {

        if(head == null) {

            addFirst(newNode);;
        }
    }
}
public class SinglyCircularLinkedList {

    public static void main(String[] args) {

        SCLinkedList scll = new SCLinkedList();
        Scanner sc = new Scanner(System.in);
        Node one = new Node(10);
        scll.addFirst(one);

        Node two = new Node(20);
        scll.addFirst(two);

        Node three = new Node(30);
        scll.addFirst(three);

        Node four = new Node(40);
        scll.addFirst(four);

        Node five = new Node(50);
        scll.addFirst(five);


        // Creating the singly Circular lindked list
        // adding the next of tail Node to the first Node
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = one;

        scll.printSCLL();
        sc.close();
    }  
}
