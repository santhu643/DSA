public class missingnumber{
    public static void main(String args[]){
    int arr[] = {0,1,2,8,5,4,7,6,3};
    int missing = cycle(arr);
    System.out.println("The missing number is : "+missing);
    }

    public static int cycle(int arr[]){
        int i=0;
        while(i<arr.length){
            int actualindex=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[actualindex]){
                int temp = arr[i];
                arr[i]=arr[actualindex];
                arr[actualindex]=temp;
            }else{
                i++;
            }
        }

        for(i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    } 
}