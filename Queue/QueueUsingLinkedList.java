
class Node {

    int data;
    Node next;
    Node(int data) {

        this.data = data;
        next = null;
    }
}

class QueueOperations {

    int[] queueArr;
    Node front;
    Node rear;

    QueueOperations( ) {

        front = null;
        rear = null;
    }

    void enQueue(int data) {
        
        Node newNode = new Node(data);
        
        if(rear == null) {

            rear.next = newNode;
        }else {

            rear.next.next = newNode;
            rear.next = newNode;
        }
    }

}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        
    }
}
