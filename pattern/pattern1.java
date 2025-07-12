public class pattern1{
    public static void main(String args[]){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int colm=row;colm<=n;colm++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}