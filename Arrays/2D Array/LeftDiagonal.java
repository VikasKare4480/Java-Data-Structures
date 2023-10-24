import java.util.*;


public class LeftDiagonal {

    static void printLeftDaigonal(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[0].length; j++) {

                if(i == j) {

                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();

        int[][] nums = new int[rows][cols];

        for(int i = 0; i < nums.length; i++) {

           for(int j = 0; j < nums.length; j++) {

                System.out.print("Enter " + (i + " " +  j)  + " th element : ");
                nums[i][j] = sc.nextInt();
           }
        }   
        printLeftDaigonal(nums);

    }
}
