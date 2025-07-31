public class reverse_word{
    public static void main(String args[]){
        String str = "I love coding";
        split(str);
    }

    public static void split(String str){
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                temp.append(str.charAt(i));
                if(i == 0 ||str.charAt(i-1)==' '){
                    for(int j=temp.length()-1;j>=0;j--){
                        res.append(temp.charAt(j));
                    }
                    res.append(" ");
                    temp.setLength(0);
                }
            }
        }
        System.out.println(res);
    }
}