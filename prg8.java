//upper bound or ceiling using binary search
public class prg8{
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,13,17};
        int target = 9;
        int res = ceiling(arr,target);
        System.out.println(res);

    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return start;
    }

}