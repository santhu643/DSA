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


// //Insertion Sort
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {7, 5, 3, 2, 4, 6};
//         int n = arr.length;

//         for (int i = 1; i < n; i++) {
//             int key = arr[i];     
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];  
//                 j--;
//             }

//             arr[j + 1] = key;  
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }