

import java.util.Scanner;

public class _4_TimeOfEquality {

    static int timeOfEquality(int arr[], int N) {

        int time = 0;

        // find the max

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {

            if(arr[i] > max) {

                max = arr[i];
            }
        }

        for(int i = 0; i < N; i++) {

            if(arr[i] != max) {

                for(int j = arr[i]; j <= max; j++) {

                    arr[i] += 1;
                    time++;

                    if(arr[i] == max) {

                        break;
                    }
                    
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter " + (i + 1) + " Elemenet ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Time of equality is " + timeOfEquality(arr, N));
        sc.close();
    }
}
