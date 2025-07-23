public class pattern5{
    public static void main(String args[]){
        pattern(9);
    }
    public static void pattern(int n){
        for(int row=0;row<2*n-1;row++){
            int totalcolm= row>=n?2*n-row-1:row+1;
            int spaces=n-row;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int colm=0;colm<totalcolm;colm++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}