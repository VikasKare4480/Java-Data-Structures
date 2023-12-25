
import java.util.Scanner;
import java.util.Stack; 

class ParenthesisValidator {
    
    boolean isBalancesparenthesis(String parenthesis) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < parenthesis.length(); i++) {

            Character ch = parenthesis.charAt(i);   

            if(ch == '{' || ch == '(' || ch == '[') {

                stack.push(ch);
                
            } else {

                // System.out.println(stack);
                
                if(!stack.isEmpty()) {

                    char top = stack.peek();
                
                    if((top == '(' && ch == ')') || (top == '[' && ch == ']' || (top == '{' && ch == '}'))) {

                        stack.pop();
                    }else {

                        return false;
                    }
                }

            }
        }
        return false;
    }
}

class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParenthesisValidator paren = new ParenthesisValidator();
        System.out.print("Enter Expression to Check Valid? : ");
        String str = sc.nextLine();

        if(paren.isBalancesparenthesis(str)) {

            System.out.println("Parethesis are Balanced");
        }else {

            System.out.println("Parentheis are Unbalanced");
        }
    }
}
