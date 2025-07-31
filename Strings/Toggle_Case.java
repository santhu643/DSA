public class Toggle_Case{
    public static void main(String args[]){
        String str = "HeLLo WoRLd";
        String result = check(str);
        System.out.println(result);
    }

    public static String check(String str){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                s.append((char)(ch+32));
            }else if(ch==' '){
                s.append(' ');
            }else{
                s.append((char)(ch-32));
            }
        }
        return s.toString();
    }
}