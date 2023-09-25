
import java.util.*;

public class factorsDemo {

    static int factorsCount(int num) { // brut force approach
        
        int count = 0;

        for(int i= 1; i <= num; i++) { // Iterations -->> num 

            if(num % i == 0) { 

                count++;
            }
        }

        return count;
    }
    
    static int factorsCount2(int num) { // Iterations -->> num / 2

        int count = 0;

        for(int i = 1; i <= num / 2; i++) {

            if(num % i == 0) {

                count++;
            }

        }
        return count + 1;
    } 

    static int factorsCount3(int num) {

        int count = 0;
        int Iterations = 0;

        for(int i = 1; i * i <= num; i++) { // Iterations -->> log(num) for num = 10 -->> 3 iteration
            Iterations++; 

            if(num % i == 0) {

                if(i == (num / i)) {

                    count++;
                }
                else {

                    count += 2;;
                }
            }
        }   
        System.out.println(Iterations);
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to find factors :");
        int num = sc.nextInt();

        System.out.println(factorsCount3(num));
    }
    
}
