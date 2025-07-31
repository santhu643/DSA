public class no_of_vowels_consonant{
    public static void main(String args[]){
        String str ="hello world";
        check(str);
    }

    public static void check(String str){
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel+=1;
            }else if(str.charAt(i)!=' '){
                consonant+=1;
            }
        }
        System.out.print(vowel + " "+ consonant);
    }
}