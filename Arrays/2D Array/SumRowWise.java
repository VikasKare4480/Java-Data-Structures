import java.util.Scanner;

public class SumRowWise {

    static void printSumRowWise(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {

            int sum = 0;    

            for(int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter columns : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                System.out.print("Enter ( " + i  + " , " + j + " ) element : "); 
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        printSumRowWise(arr);
        
    }
}
