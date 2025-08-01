public class Check_Subsequence{
    public static void main(String args[]){
        String str1="abc";
        String str2="ahbgdc";
        String result=check(str1,str2);
        System.out.println(result);
    }

    public static String check(String str1,String str2){
        int j=0,i=0;
        while(j<str1.length() && i<str2.length()){
            if(str1.charAt(j)==str2.charAt(i)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==str1.length()){
            return "YES";
        }else{
            return "NO";
        }
    }
}