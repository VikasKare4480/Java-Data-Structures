import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
 
        int arr1[] = {12,4,22,10,15,56,34,82};
        System.out.println(Arrays.toString(arr1));
        quickSort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
}
