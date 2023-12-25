import java.util.Scanner;
import java.util.Stack;

class ReverseString {

    String reverseString(String str) {

        char[] stackArr = new char[str.length()];
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            stack.push(str.charAt(i));
        }

        int i = 0;

        while (!stack.isEmpty()) {

            stackArr[i] = stack.pop();            
            i++;
        }

        return new String(stackArr);
    }

}

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to reverse : ");
        String str = sc.nextLine();

        ReverseString rs = new ReverseString();

        System.out.println("Reversed String is : " + rs.reverseString(str));
    }
}
