
import java.util.Queue; // Queue is interface 
import java.util.LinkedList;
// import java.util.Stack;

class Client {
    public static void main(String[] args) {

            Queue<Integer> myQueue = new LinkedList<>();

            System.out.println(myQueue);
            myQueue.add(10);
            myQueue.add(20);
            myQueue.offer(30); // Queues method
            myQueue.offer(40); 
            System.out.println(myQueue);
            
            System.out.println(myQueue.element()); // 10
            System.out.println(myQueue.peek()); // Queues Method 10

            System.out.println(myQueue.remove()); // 10 get removed
            System.out.println(myQueue.poll()); // 20 get removed 
            
            System.out.println("After the remove / opeantion on queue");
            System.out.println(myQueue);

            System.out.println(myQueue.size());
    }
}
