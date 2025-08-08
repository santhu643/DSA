public class findmax {
    public static void main(String[] args) {
        int[] arr = {1,4,10,3,88};
        System.out.println(maxarr(arr));
    }

    static int maxarr(int[] nums){
        int maxval = Integer.MIN_VALUE;
        int start = 0,end = nums.length-1;
        while(start<=end){
            if(nums[start]>maxval){
                maxval = nums[start];
            }
            start++;
            
        }
        return maxval;
    }
}
