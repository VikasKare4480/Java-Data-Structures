import java.util.*;

public class midLineApproach {

    static int midLineApproach(int num) {

        int start = 1;
        int end = num;
        int ans = 0;

        while (start <= end) {

            int mid = (start + end) / 2;

            if(mid * mid < num) {

                start = mid + 1;
                ans = mid;
            
            }

            if(mid * mid > num) {

                end = mid - 1;
            }

            if(mid * mid == num) {

                return mid;
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        // int num = sc.nextInt();

        sc.close();
    }
    
}
