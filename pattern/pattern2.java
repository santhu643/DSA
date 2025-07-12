public class pattern2{
    public static void main(String args[]){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int colm=1;colm<=row;colm++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}