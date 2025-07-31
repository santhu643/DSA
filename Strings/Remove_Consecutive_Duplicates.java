public class Remove_Consecutive_Duplicates{
    public static void main(String args[]){
        String str = "aaabbcddd";
        String result = check(str);
        System.out.println(result);
    }

    public static String check(String str){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                s.append(str.charAt(i));
            }
        }
        s.append(str.charAt(str.length()-1));

        return s.toString();
    }
}