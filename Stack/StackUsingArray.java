package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {

    int stackSize;
    int stackArr[];
    int top = -1;
    
    Stack(int stackSize) {

        stackArr = new int[stackSize];
        this.stackSize = stackSize;
    }

    int push(int data) {

        if(top == stackSize - 1) {

            System.out.println("StackOverFlow");
            return -1;

        }else { 

            top++;
            stackArr[top] = data;
            return data;
        }  
    }

    int pop() {

        if(top == -1) {

            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = stackArr[top];
        top--;
        return popped;
    }

    int peek() {

        if(isEmpty()) {

            System.out.println("Stack is empty");
            return -1;
        }
        return stackArr[top];
    }

    int stackSize() {

        return top + 1;
    }

    int countElements() {

        if(isEmpty()) {

            System.out.println("Stack is empty");
            return -1;
        }
        int count = 0;
        int temp = 0;
        while (temp <= top) {

            count++;
            temp++;
        }   

        return count;
    }   

    Boolean isEmpty() {

        if(top == -1) {
            return true;
        }
        return false;
    }

    void printStackElements() {

        if(isEmpty()) {

            System.out.println("Stack is empty");
            return;
        }

        System.out.println("In forward manner");
        int i = top;

        System.out.print("[");
        while (i >= 0) {

            System.out.print(" " + stackArr[i] + " ");
            i--;
        }
        System.out.println("]");
        System.out.println();
        System.out.println("In reverse order");

        System.out.print("[");
        for(int ele = 0; ele <= top; ele++) {

            System.out.print(" " + stackArr[ele] + " ");
        }
        System.out.println("]");
    }
}

public class StackUsingArray {
 
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the Stack : ");
        int stackSize = Integer.parseInt(br.readLine());

        Stack myStack = new Stack(stackSize);
        char ch;
        do {    

            System.out.println("1. Push Element \n2. Pop Element \n3. Peek Element \n4. isEmpty Elements \n5. Element Count \n6. Print Stack \n7. Stack Size");
            System.out.print("Enter Choice : ");
            int choice = Integer.parseInt(br.readLine());

            switch(choice) {

                case 1 : {

                    System.out.print("Enter data to Push : ");
                    int data = Integer.parseInt(br.readLine());
                    
                    if(myStack.push(data) != -1) {

                        System.out.println(data + " : is pushed to stack");
                    }
                    break;
                }

                case 2 : {

                    int poped = myStack.pop();
                    if(poped != -1) {

                        System.out.println("Popped element : " + poped);
                    }
                    break;   
                }
                
                case 3 : {

                    if(myStack.peek() != -1) {

                        System.out.println("Peek element is : " + myStack.peek());
                    }
                    break;
                }

                case 4 : {  

                    if(myStack.isEmpty()) {

                        System.out.println("Stack is empty : " + myStack.isEmpty());

                    }else {

                        System.out.println("Stack is not empty ");
                    }
                    break;
                }

                case 5 : {

                    if(myStack.countElements() != -1) {

                        System.out.println("Elements in the Stack are : " + myStack.countElements());
                    }
                    break;
                }

                case 6 : {

                    myStack.printStackElements();
                    break;
                }

                case 7 : {

                    System.out.println("Stack size is : " + myStack.stackSize());
                    break;
                }

                default : {

                    System.out.println("Please enter the valid chice");
                    break;
                }
            }

            System.out.print("Do you want to countinue : ");
            ch = br.readLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}

