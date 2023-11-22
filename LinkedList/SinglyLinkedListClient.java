package LinkedList;

public class SinglyLinkedListClient {
    

    public static void main(String[] args) {
     
        
        System.out.println("In SSLClient");
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

        head = newNode;
    }

    void addLast(int data) {


    }

    void addAtPos(int pos, int data) {
        

    }

    void deleteFirst() {


    }

    void deleteLast() {


    }

    void deleteAtPos(int pos) {

        
    }

    int count() {

        int count = 0; 

        return count;
    }

    void pritnSLL() {


    }
    
}




