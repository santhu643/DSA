//Remove duplicates from an array

import java.util.ArrayList;

public class prob1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        finddup(arr);
    }

    static void finddup(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(!(list.contains(nums[i]))){
                list.add(nums[i]);
            }
        }
        System.out.println(list);
    }
    
}
