public class bitonic_point{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,2,1};
        System.out.print(find(arr));
    }

    public static int find(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return arr[mid];
            }else if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}