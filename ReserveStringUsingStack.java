
import java.util.Scanner;  
import java.util.Stack; 
import java.util.List;

public class ReserveStringUsingStack {

    static String reverseStringWithStack(String str) {

        List<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            stack.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        System.out.println(stack.size());
        int i = stack.size() - 1;
        while (i >= 0) {

            sb.append(stack.get(i));
            i--;
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
