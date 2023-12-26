package Stack;

class Node {

    int data;
    Node next = null;

    Node(int data) {

        this.data = data;
    }
}

class MyStack {

    Node top;

    MyStack() {

        this.top = null;
    }
    
    void push(int data) {

        Node newNode = new Node(data);
        if(top == null) {

            newNode.next = top;
            top = newNode;     
        }

        newNode.next = top;
        top = newNode;
        System.out.println("Node is inseted");
    }
    
    int pop() {

        if(top == null) {

            System.out.println("Top is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    int peek() {    

        return isEmpty() ? -1 : top.data;
    }

    boolean isEmpty() {

        return top == null;
    }

    void printStackElements() {

        if(top == null) {

            System.out.println("Stack is empty");
        }else {

            Node temp = top;

            while (temp.next != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;                
            }
        }
    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        myStack.printStackElements();  
    }
}

