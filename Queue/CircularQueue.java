import java.util.Scanner;

class CircularQueue {
    
    int front;
    int rear;
    int[] queueArr;
    int maxSize;

    // initializing the queue array 
    CircularQueue(int queueSize) {  
        
        this.queueArr = new int[queueSize];
        this.front = -1;
        this.rear = -1;
        this.maxSize = queueSize;
    }

    // Insert into Circular queue 

    void enqueue(int data) {

        if(isFull()) {

            System.out.println("Queue is full can't add to the Queue");
        }else if(front == -1) {

            front = rear = 0;
        } else if(rear == maxSize - 1 && front != 0) {

            rear = 0;
        }else {
            
            rear++;
        }
        queueArr[rear] = data;
    }

    int dequeue() {

        if(front == -1) {

            System.out.println("Queue is empty");
            return -1;
        }else {

            int ret = queueArr[front];
            if(front == rear) {

                rear = front = -1;
            }else if(front == maxSize -1) {

                front = 0;
            }else {

                front++;
            }
            return ret;
        }
    }

    int frontElement() {

        if(front >= 0 && front < queueArr.length) {
            
            return queueArr[front];
        }

        return Integer.MIN_VALUE;
    }

    int rearElement() {

        if(rear >= 0 && rear < queueArr.length) {

            return queueArr[rear];
        }

        return Integer.MIN_VALUE;
    }   
    

    boolean isEmpty() {

        if(front == -1) {

            return true;
        }
        return false;
    }

    boolean isFull() {
        // maxSize - 1 == queueArr - 1
        if((front == 0 && rear == maxSize - 1) || (rear + 1) % maxSize == front) {

            return true; 
        }
        return false;
    }


    void printCircularQueue() {

        if(front <= rear) { // =  for single element

            for(int i = front; i <= rear; i++) {    

                System.out.println(queueArr[i] + " ");
            }
        }else {

            for(int i = front; i < maxSize; i++) {

                System.out.print(queueArr[i] + " ");
            }

            for(int i = 0; i <= rear; i++) {

                System.out.print(queueArr[i] + " ");
            }
        }

        System.out.println();
    }
}

class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("*****This is circular Queue Implementation*****");   

        System.out.println("Enter the size of the Circular Queue : ");
        int queueSize = sc.nextInt();
        CircularQueue cq = new CircularQueue(queueSize);
        
        char ch;
        do {

            System.out.println("1. enqueue \n2. dequeue \n3. frontElement \n4. rearElemet \n5. isEmpty \n6. isFull \n7. Print Circular Queue");
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                
                case 1:  {   

                    System.out.println("Enter the data to enqueue : ");
                    int data = sc.nextInt();
                    cq.enqueue(data);
                }
                break;
                case 2 : {

                    if(cq.dequeue() != -1) {

                        System.out.println("Element removed is : " + cq.dequeue() );
                    }
                }
                break;
                case 3 : {

                    System.out.println("Front Element is : " + cq.frontElement());
                }
                break;

                case 4 : {

                    System.out.println("Element at the rear is : " + cq.rearElement());
                }
                break;

                case 5 : {

                    if(cq.isEmpty()) {

                        System.out.println("Circular queue is empty");
                    }else {

                        System.out.println("Not empty queue");
                    }
                }
                break;
                case 6 : {

                    if(cq.isFull()) {

                        System.out.println("Circular Queue is Full");
                    }else {

                        System.out.println("Circular queue is not Full");
                    }
                }
                case 7 : {
                    
                    cq.printCircularQueue();
                }
                break;
                default:
                    System.out.println("Not found any maatch");
                    break;
            }

            System.out.println("Do you want to countinue : ");
            ch = sc.nextLine().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}
