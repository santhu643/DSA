public class array_subsetofanother{
    public static void main(String args[]){
        int []arr1={1,2,3,4};
        int []arr2={2,4,5};
        System.out.print(find(arr1,arr2));
    }

    public static boolean find(int arr1[],int arr2[]){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                return false;
            }
        }
        if(j!=arr2.length){
            return false;
        }
        return true;
    }
}