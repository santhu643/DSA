public class Matrix1{
    public static void main(String[] args){
        int [][] arr = {
            {1,2,3},        /* 7 4 1 */            //20 10 00
            {4,5,6},        /* 8 5 2 */            //21 11 21
            {7,8,9}         /* 9 6 3 */            //00 10 20
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 20 10 00
        
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}