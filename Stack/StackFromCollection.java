package Stack;
import java.util.Stack;


class StackFromCollecion {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.add(10);
        myStack.push(50);
        myStack.push("Google");

        
        for(var data : myStack) {

            System.out.println(data);
        }

        System.out.println(myStack);
        System.out.println("Data at the top of the stack : " + myStack.peek());  
        System.out.println("POP : " + myStack.pop()); 
        System.out.println("Pop() next : " + myStack.pop());
        System.out.println("pushed data : " + myStack.push("Microsoft"));
        System.out.println("Stack is empty ? : " + myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("After pop() : " + myStack);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.search("Microsoft"));
    }
}