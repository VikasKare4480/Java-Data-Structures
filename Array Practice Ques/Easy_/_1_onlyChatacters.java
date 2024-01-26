package Easy_;
import java.util.Scanner;

public class _1_onlyChatacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String input = scanner.nextLine();

        // char[] inputArray = input.toCharArray();
        // char[] resultArray = new char[inputArray.length];
        // int resultIndex = 0;

        // for (char c : inputArray) {
        //     if (Character.isLetter(c)) {
        //         resultArray[resultIndex++] = c;
        //     }
        // }

        // System.out.print("Output: ");
        // for (int i = 0; i < resultIndex; i++) {
        //     System.out.print(resultArray[i] + " ");
        // }

        System.out.println("Enter " );
        String charcters = scanner.nextLine();

        char[] arr = charcters.toCharArray();

        for(char data : arr) {

            if(Character.isLetter(data)) {

                System.out.println(data);
            }
        }
        scanner.close();
    }
}
