import java.util.*;
public class non_repeating{
    public static void main(String args[]){
        String str = "abbccd";
        repeat(str);
    }

    public static void repeat(String str){
        Map<Character,Integer> s = new HashMap<>();
        for(int i=0;i<str.length();i++){
            s.put(str.charAt(i),s.getOrDefault(str.charAt(i),0)+1);
        }
        for (Map.Entry<Character, Integer> entry : s.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if(value==1){
                System.out.print(key);
                break;
            }
        }

    }
}