public class Longest_Common_Prefix{
    public static void main(String args[]){
        String[] arr = {"flower","flow","flight"};
        String ans = check(arr);
        System.out.println(ans);
    }

    public static String check(String arr[]){
        StringBuilder s = new StringBuilder(arr[0]);
        for(int i=1;i<arr.length;i++){
            int j=0;
            while(j<s.length() && j<arr[i].length()){
                if(s.charAt(j)!=arr[i].charAt(j)){
                    s.delete(j,s.length());
                }
                j++;
            }
        }
        return s.toString();
    }
}