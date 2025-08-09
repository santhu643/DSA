public class collection3{
    public static void main(String args[]){
         int[] arr = {10, 20, 30, 40, 50};
        int size = 5;

        size = removeAtIndex(arr, size, 2);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeAtIndex(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return size;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }
}