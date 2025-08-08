import java.util.*;
public class cyclicsort{
    public static void main (String []args){
        int[] arr = {2,3,6,4,5,1};
        cycle(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void cycle(int[] arr){
        int i = 0;
        while(i < arr.length){
            int actualindex = arr[i]-1;
            if(arr[i]!=arr[actualindex]){
                int temp = arr[i];
                arr[i] = arr[actualindex];
                arr[actualindex] = temp;
            }else{
                i++;
            }
        }
    }
}