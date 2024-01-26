import java.util.Scanner;

class Queue {

    int front;
    int rear;
    int[] queueArr;
    int queueSize;

    Queue(int queueSize) {

        front = -1;
        rear = -1;
        queueArr = new int[queueSize];
        this.queueSize = queueSize;
    }

    void enqueue(int data) {

        if(rear == queueSize - 1) {

            System.out.println("Queue is full");
            return;

        }else if(rear == -1) {

            front++; rear++;
        }else {

            rear++;
        }

        queueArr[rear] = data;
    }

    int dequeue() {
        
        if(rear == -1 || front == -1) {

            System.out.println("Queue is empty");
            return -1;
        }else {

            int ret = queueArr[front];

            if(front > rear) {

                front = rear = -1;
            }
            front++;
            return ret;
        }
    }

    boolean empty() {

        if(front == -1) {

            return true;
        }else {

            return false;
        }
    }

    int frontElement() {

        if(front == -1) {

            System.out.println("Queue is empty");
            return -1;
        }

        return queueArr[front];
    }

    int rearElement() {

        if(rear == -1) {

            System.out.println("Queue is empty");
            return -1;
        }
        return queueArr[rear];
    }

    void printQueue() {

        if(front == -1) {

            System.out.println("Queue is empty");
            return;

        }else {

            for(int i = front; i <= rear; i++) {

            System.out.print(" " + queueArr[i]);
        }
            System.out.println();
        }
    }
}

class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Queue : ");
        int queueSize = sc.nextInt();

        Queue myQueue = new Queue(queueSize);

        char ch;
        do {

            System.out.println("1. Enqueue Data : ");
            System.out.println("2. Dqueue Data : ");
            System.out.println("3. Front element : ");
            System.out.println("4. rear element : ");
            System.out.println("5. Empty : ");
            System.out.println("6. Print Queu : ");

            System.out.print("Enter the choice : ");
            int choice = sc.nextInt();
            int data;
            switch (choice) {

                case 1: 
                    System.out.print("Enter the data : ");
                    data = sc.nextInt();   
                    myQueue.enqueue(data);
                    break;
                
                case 2 : 

                    System.out.println("removed data " + myQueue.dequeue());
                    break;
                
                case 3 :

                    System.out.println("Front element is  : " + myQueue.frontElement());
                    break;

                case 4 :

                    System.out.println("Rear element is  : " + myQueue.rearElement());
                    break;

                case 5 :

                    if(myQueue.empty()) {

                        System.out.println("Queue is empty");
                    }else {

                        System.out.println("Queue is not empty");
                    }
                    break;
                    
                case 6:
                    myQueue.printQueue();
                    break;
                    
                default:
                    System.out.println("No match found");
                    break;
            }

            System.out.print("Do you want to countinue(Y/y) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        sc.close();
    }
}