
import java.util.Scanner;
class MadeWithLove  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String lastName = sc.nextLine();
        System.out.println("Wel-Come " + firstName + " " + lastName);
        sc.close();
    }
}