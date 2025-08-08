import java.util.Arrays;

public class InsertionSortSwap {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // Keep swapping backwards until correct position is found.....
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 4, 3, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
