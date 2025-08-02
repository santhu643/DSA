import java.util.*;
public class parenthesis{
    public static void main(String args[]){
        String str="([]{})";
        boolean result = check(str);
        System.out.println(result);
    }

    public static boolean check(String str){
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        Stack <Character> s = new Stack <Character> ();
        map.put('(',')');        
        map.put('[',']');
        map.put('{','}');
        for(int i=0;i<str.length();i++){
            
            if(map.containsKey(str.charAt(i))){
                s.push(str.charAt(i));
            }else{
                if(map.get(s.peek())==str.charAt(i)){
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
}