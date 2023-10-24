import java.util.Scanner;

public class RightDiagonal {
    

    static void printRightDaigonal(int[][] arr) {

        int i = 0;
        int j = arr.length - 1;
        while(i <= arr.length && j >= 0) {

            System.out.print(arr[i][j] + " ");
            i++;j--;
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

        printRightDaigonal(nums);
    }
}
