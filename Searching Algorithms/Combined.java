
import java.io.*;
import java.util.*;

public class Combined {

    int linearSearch(int[] arr, int target) {

        int index = -1;
        int i = 0;

        while(i < arr.length) {

            if(arr[i] == target) {

                return i;
            }
            i++;
        }
        return index;
    }

    int binarySearch(int[] arr, int target) {

        int index = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {

                return mid;
            }
            else if(arr[mid] < target) {

                start = mid + 1;
            }

            else if(arr[mid] > target) {
                
                end = mid - 1;
            } 
        }
        return index;
    }

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Combined ls = new Combined();

        System.out.print("Enter size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        int[] sorted = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
            
        }

        System.out.print("Array -> ");
        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }


        for(int i = 0; i < arr.length; i++) {

            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);
        System.out.println();
        System.out.print("Sorted -> ");
        
        
        for(int i = 0; i < arr.length; i++) {

            System.out.print(sorted[i] + " ");
        }
        boolean wantToContine = true;

        while (wantToContine) {

            System.out.println("\n 1 : Linear Search \n 2 : Binary Search ");

            System.out.print("Enter Choice : ");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1 : {
    
                    System.out.println("------Wel-Come To -->> Linear Search ------");
                    System.out.println();
                    System.out.print("Enter taget : ");
                    int target = Integer.parseInt(br.readLine());
    
                    int foundAt = ls.linearSearch(arr, target);

                    if(foundAt != -1) {
    
                        System.out.println(target + " found at index : " + foundAt);
                    }
                    else {
    
                        System.out.println(target + " not found in Array");
                    }
    
                    break;
                }
    
                case 2 : {
    
                    System.out.println("------ Wel-Come To -->> Binary Search -----");
                    System.out.println();
                    System.out.print("Enter the tagert : ");
                    int target = Integer.parseInt(br.readLine());

                    System.out.println();

                    int foundAt = ls.binarySearch(sorted, target);
                    
                    if(foundAt != -1) {
    
                        System.out.println(target + " found at index " + foundAt);
                    }
                    else {
    
                        System.out.println(target + " not found in Array ");
                    }
                    break;
                }
    
                default : {
    
                    System.out.println("No match (in default) found please enter the correct choice");
                    break;
                }
            }   

            System.out.print("Do you want to Continue : (Y / N) : ");
            char ch = br.readLine().charAt(0);

            if(ch == 'Y' || ch == 'y') {

                wantToContine = true;
            }else {

                wantToContine = false;
            }
        }
    }
}
