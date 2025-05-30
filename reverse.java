import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        System.out.println("hiii");
        int[] arr = {1,2,3,4,5};
        System.out.println("hiii1");

        swaparr(arr);
        System.out.println("hiii2");

        System.out.println(Arrays.toString(arr));
        
    }

    static void swaparr(int[] nums){
        System.out.println("hiii3");

        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }
    
}
