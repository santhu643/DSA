import java.util.*;
public class cyclicsort{
    public static void main (String []args){
        int[] arr = {5,3,10,25,2,4,1};
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