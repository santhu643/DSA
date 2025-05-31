import java.util.*;
public class selectionsort{
    public static void main(String[] args){
        int[] arr = {8,5,1,4,3,6};
        for(int i=0;i<arr.length;i++){
            int maxindex = max(arr,arr.length-1-i);
            sort(arr,maxindex,arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int max(int[] arr,int checkuptoindex){
        int maxval = 0;
        for(int i = 1; i < checkuptoindex; i++){
            if(arr[i]>arr[maxval]){
                maxval = i;
            }
        }
        return maxval;
    }
    public static void sort(int[] arr,int maxindex, int lastindex){
        int temp = arr[maxindex];
        arr[maxindex] = arr[lastindex];
        arr[lastindex] = temp;
    }
}