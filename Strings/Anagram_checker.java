import java.util.*;
public class Anagram_checker{
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";
        anagram(str1,str2);
    }

    public static void anagram(String str1, String str2){
        int right=0;
        int left=0;
        if(str1.length() != str2.length()){
            System.out.println("NO");
            return;
        }
        Map<Character,Integer> s = new HashMap<Character,Integer>();
        for(int i=0;i<str1.length();i++){
            s.put(str1.charAt(i),s.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
             s.put(str2.charAt(i),s.getOrDefault(str2.charAt(i),0)+1);
        }
        boolean ana = true;
        for(Map.Entry<Character, Integer> entry : s.entrySet()){
             if(entry.getValue()!=2){
                ana=false;
                break;
             }
        }
        if(ana){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}