import java.util.*;
public class String_compression{
    public static void main(String args[]){
        String str = "aabcccccaaa";
        compress(str);
    }

    public static void compress(String str){
        Map<Character,Integer> s = new HashMap<>();
        for(int i=0;i<str.length();i++){
            s.put(str.charAt(i),s.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry <Character,Integer> entry:s.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
    }
}