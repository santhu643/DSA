public class uniqueelement{
    public static void main(String args[]){
        int []arr={4,-2,0,4,-2};
        System.out.print(find(arr));
    }

    public static int find(int arr[]){
        int result=0;
        for(int num:arr){
            result^=num;
        }
        return result;
    }
}