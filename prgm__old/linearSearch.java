public class linearSearch{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 20;
        int ans = linear(arr , target);
        System.out.println(ans);
    }

    public static int linear(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}