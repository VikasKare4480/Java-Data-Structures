import java.util.Scanner;

public class SumOfOddnumbers {
    

    static int oddSum = 0;
    static int sumOfOddNumbers(int num) {

        if(num == 0) {

            return oddSum;
        }
        
        if((num % 10) % 2 != 0) {

            oddSum += num % 10; 
        }
        return sumOfOddNumbers(num / 10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();

        int productOfDigits = sumOfOddNumbers(num);
        System.out.println("Sum of odd numbers is : " + productOfDigits);
        sc.close();

        int oddSum = 0;

        for(int i = 0; num != 0; i++) {

            if((num % 10)  % 2 !=0) {

                oddSum += (num % 10);
            }
            num /= 10;
        }
        System.out.println("Odd sum : " + oddSum);
    }
}
