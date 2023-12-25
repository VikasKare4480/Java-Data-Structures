

import java.util.*;

class TwoStacks {

    int stackArr[]; // = new int[stackSize];
    int top1;
    int top2;
    int maxSize; // stacksize
        
    TwoStacks(int stackSize) {

        this.stackArr = new int[stackSize]; 
        this.top1 = -1;
        this.top2 = stackSize;
        this.maxSize = stackSize;
    }

    void push1(int data) {

        if(top2 - top1 > 1) {

            // top++;
            stackArr[++top1] = data;
        } else {

            System.out.println("Stack Overflow");
        }
    }

    void push2(int data) {
       
        if(top2 - top1 > 1) {

            // top2--;
            stackArr[--top2] = data;
        }else {

            System.out.println("Stack Overflow");
        }
       
    }

    int pop1() {
        if(top1 == -1) {

            System.out.println("Stack is empty");
            return -1;
        }else {

            int popped = stackArr[top1--];
            // top1--;
            return popped;
        }
    }

    int pop2() {

        if(top2 == maxSize) {

            System.out.println("Stack 2 is empty");
            return -1;

        }else {

            int popped = stackArr[top2++];
            // top2++;
            return popped;
        }
        
    }

    void printStack1() {

        if(top1 == -1) {

            System.out.println("Stack 1 is empty");
        }else {

            for (int i = 0; i <= top1; i++) {

                System.out.print(stackArr[i] + " ");
            }
        }
        System.out.println();
    }

    void printStack2() {

        if(top2 == maxSize) {

            System.out.println("Stack 2 is empty");
            return;

        }else {

            for(int i = top2; i < maxSize; i++) {

                System.out.print(stackArr[i] + " ");
            }
        }

        System.out.println();
    }

    void printBothStacks() {

        if(top1 == -1 ) {

            System.out.println("Stack 1 is empty");
        }

        if(top2 == maxSize) {

            System.out.println("Stack 2 is empty");
        }

        for(int i = 0; i < maxSize; i++) {

            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }

}
public class TwoStackInOneArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stack size : ");
        int stackSize = sc.nextInt();

        TwoStacks myStacks = new TwoStacks(stackSize);

        char ch;

        do {  

            System.out.println("1.Push1");
            System.out.println("2.Push2");
            System.out.println("3.Pop1");
            System.out.println("4.Pop2");
            System.out.println("5.Print stack 1");
            System.out.println("6.Print stack 2");
            System.out.println("7.print Both");


            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            int data;
            switch (choice) {

                case 1:
                    System.out.print("Enter the data to push1 : ");
                    data = sc.nextInt();
                    myStacks.push1(data);
                    break;
                
                case 2 :
                    System.out.print("Enter the data to push2 : ");
                    data = sc.nextInt();
                    myStacks.push2(data);
                    break;
                
                case 3: 
                    System.out.println("Popped data " + myStacks.pop1());
                    break;

                case 4:

                    System.out.println("Popped data " + myStacks.pop1());
                    break;

                case 5:

                    myStacks.printStack1();
                    break;

                case 6:
        
                    myStacks.printStack2();
                    break;

                case 7 : 

                    myStacks.printBothStacks();
                    break;
                    
                default:
                    break;
            }

            System.out.print("Do you want to continue : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
