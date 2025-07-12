public class pattern3{
    public static void main(String args[]){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            int sum=0;
            for(int colm=1;colm<=row;colm++){
                sum++;
                System.out.print(sum +" ");
            }
            System.out.println();
        }
    }
}