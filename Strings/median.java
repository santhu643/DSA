import java.util.*;
public class median{
    public static void main(String args[]){
        int[] arr1 = {1,2};
        int[] arr2 = {2};
        double res = check(arr1,arr2);
        
        System.out.printf("%.5f",res);
    }

    public static double check(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int k=0;
        for(int j=arr1.length;j<arr1.length+arr2.length;j++){
            arr3[j]=arr2[k++];
        }
        Arrays.sort(arr3);

        if(arr3.length%2==0){
            return ((arr3[arr3.length/2])+(arr3[(arr3.length/2)-1]))/2.0;
        }else{
            return arr3[arr3.length/2];
        }
        
    }
}