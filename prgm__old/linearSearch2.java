public class linearSearch2{
    public static void main(String[] args){
        String name = "Santhu";
        int target = 'u';
        int ans = linear(name , target);
        System.out.println(ans);
    }

    public static int linear(String name , int target){
        if(name.length() == 0){
            return -1;
        }

        for(int index = 0; index < name.length(); index++){
            if(name.charAt(index) == target){
                return index;
            }
        }
        return -1;
    }
}