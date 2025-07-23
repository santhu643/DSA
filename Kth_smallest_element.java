import java.util.*;
public class Kth_smallest_element{
    public static void main(String args[]){
        int arr[]={4,8,7,1,10,2,14};
        int k=8;
        System.out.print(find(arr,k));
    }

    public static int find(int arr[],int k){
        if(arr.length-1<k){
            return -1;
        }
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int num: arr){
            min.add(num);
        }
        for(int i=0;i<k-1;i++){
            min.poll();
        }   
        return min.peek();
    }
}