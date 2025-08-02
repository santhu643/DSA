import java.util.*;
public class Matrix2{
    public static void main(String[] args){
        int [][] arr = {
            {1,2,3},        /* 7 4 1 */            //20 10 00
            {4,5,6},        /* 8 5 2 */            //21 11 12
            {7,8,9}         /* 9 6 3 */            //00 10 20
        };

        int temp=0; 
        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j < arr[i].length; j++){
                
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;

            }
        }

        // int j=0;
        // for(int i=0;i<arr.length;i+=arr.length-1){
            
        //         temp = arr[i][j];
        //         arr[i][j]=arr[i][j];
        //         arr[i][j]=temp;
            
        //     j++;
        // }


        for(int i=0;i<arr.length;i++){
            int left=0,right=arr.length-1;
            while(left<right){
                int c = arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=c;
                left++;
                right--;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j =0;j< arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}