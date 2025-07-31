public class string_repeatation{
    public static void main(String args[]){
        String str = "aabcccccaaa";
        check(str);
    }

    public static void check(String str){
        int j=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                j+=1;
            }else{
                System.out.print(str.charAt(i));
                System.out.print(j);
                j=1;
            }
        }
        System.out.print(str.charAt(str.length() - 1));
        System.out.print(j);
    }
}