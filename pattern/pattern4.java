public class pattern4{
    public static void main(String args[]){
        pattern(9);
    }
    public static void pattern(int n){
        for(int row=0;row<2*n;row++){
            int totalcolm= row>n?2*n-row:row;
            for(int colm=0;colm<totalcolm;colm++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}