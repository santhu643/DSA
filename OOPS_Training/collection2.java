public class collection2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int size = 0;

        size = insert(arr, size, 10); 
        size = insert(arr, size, 20); 
        size = insert(arr, size, 30); 
        size = insert(arr, size, 40); 
    }

    public static int insert(int[] arr, int size, int value) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.println("Array resized to length: " + arr.length);
        }
        arr[size] = value;
        size++;
        System.out.print("Current Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return size;
    }
}
