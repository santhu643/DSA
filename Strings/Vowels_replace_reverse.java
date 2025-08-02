public class Vowels_replace_reverse {
    public static void main(String args[]) {
        String str = "Zoho Coporation";
        String result = check(str);
        System.out.println(result);
    }

    public static String check(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);

            if (isVowel(lChar) && isVowel(rChar)) {
                s.setCharAt(left, rChar);
                s.setCharAt(right, lChar);
                left++;
                right--;
            } else if (!isVowel(lChar)) {
                left++;
            } else if (!isVowel(rChar)) {
                right--;
            }
        }
        return s.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}