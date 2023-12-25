
import java.util.Stack;

class MergeTwoSortedStacks {

    Stack<Integer> mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {

        Stack<Integer> stack3 = new Stack<>();

        while (!stack1.isEmpty() && !stack2.isEmpty()) {

            if(stack1.peek() > stack2.peek()) {

                stack3.push(stack1.pop());
            }else {

                stack3.push(stack2.pop());
            }  
        }

        while (!stack1.isEmpty()) {

            stack3.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {

            stack3.push(stack2.peek());
        }   

        while (!stack3.isEmpty()) {

            stack1.push(stack3.pop());     
        }
        return stack1;
    }
}

class Client {

    public static void main(String[] args) {
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(3);
        stack1.push(5);
        stack1.push(7);

        stack2.push(2);
        stack2.push(4);
        stack2.push(6);
        stack2.push(8);
        stack2.push(10);

        MergeTwoSortedStacks ms = new MergeTwoSortedStacks();

        Stack<Integer> stack3 = ms.mergeStacks(stack1, stack2);
        System.out.println(stack3);
        stack3.pop();
        System.out.println(stack3);
    }
}
