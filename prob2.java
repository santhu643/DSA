//second largest element

import java.util.Arrays;

public class prob2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99,99,99};
        int sec = seclarge(arr);
        System.out.println(sec);
    }

    static int seclarge(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-2];
    }
    
}
