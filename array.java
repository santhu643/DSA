class array{
    public static void main(String[] args){
        int[] numbers = {1,4,20,13,10,5};
        int target = 33;
        int sum = 0;
        
        for(int i=0;i<numbers.length;i++){
            int j = i;
            sum+= numbers[i];
            if(sum<target){
                j++;
            }else if(sum == target){
                System.out.println(i + " " + j);
            }
            else{
                i++;
                j=i;
                sum = 0;
            }
        }
    }
}