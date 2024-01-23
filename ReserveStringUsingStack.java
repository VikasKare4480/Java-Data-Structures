
import java.util.Scanner;  
import java.util.Stack; 

public class ReserveStringUsingStack {

    static String reverseStringWithStack(String str) {

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {

            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Entered String : " + str);
        System.out.println("Reversed String using Stack : " +  ReserveStringUsingStack.reverseStringWithStack(str));
        sc.close();
    }
}
