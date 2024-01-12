public class BubbleWithRecursion {

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void bubbleSort(int[] arr, int n) {

        if(n == 1) {

            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                swap(arr, i, i + 1);
            }
        } 
        
        bubbleSort(arr, --n);
    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {45,78,65,12,32};

        System.out.println("Before Sorting : ");
        printArray(arr);

        bubbleSort(arr, arr.length);

        System.out.println("After sorting : ");
        printArray(arr);


        int[] arr1 = {1, 2, 3, 4, 5};
        bubbleSort(arr1, arr1.length);
        printArray(arr1);

        // Test Case 2: Array sorted in descending order
        int[] arr2 = {10, 8, 6, 4, 2};
        bubbleSort(arr2, arr2.length);
        printArray(arr2);

        // Test Case 3: Array with duplicate elements
        int[] arr3 = {5, 3, 5, 2, 1};
        bubbleSort(arr3, arr3.length);
        printArray(arr3);

        // Test Case 4: Array with all elements equal
        int[] arr4 = {7, 7, 7, 7, 7};
        bubbleSort(arr4, arr3.length);
        printArray(arr4);

        // Test Case 5: Random unsorted array
        int[] arr5 = {45, 78, 65, 12, 32};
        bubbleSort(arr5, arr5.length);
        printArray(arr5);
    }
}
