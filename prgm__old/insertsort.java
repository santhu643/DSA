//insertion sort
import java.util.*;
public class insertsort{
    public static void main (String[] args){
        int[] arr = {5,4,3,2,1};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1;j > 0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
}