public class alpha_palindrome{
    public static void main(String args[]){
        String str = "A man, a plan, a canal: Panama";
        rev(str);
    }

    public static void rev(String str){
        StringBuilder temp = new StringBuilder();
        int len = str.length();
        for(int i=0;i<len-1;i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>= '0' && str.charAt(i)<='9')){
                temp.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        int left=0,right=temp.length()-1;
        boolean palin=true;
        while(left<=right){
            if(temp.charAt(left) != temp.charAt(right)){
                palin=false;
                break;
            }else{
                left++;
                right--;
            }
        }

        if(palin){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}