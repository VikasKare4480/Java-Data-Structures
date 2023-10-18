import java.util.Scanner;

class Print2DArray {


    static void print2dArray(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

        print2dArray(arr);
    }
}