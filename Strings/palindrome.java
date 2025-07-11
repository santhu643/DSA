public class palindrome {
    public static void main(String args[]) {
        String str1 = "abcba";
        String str = str1.toLowerCase();
        boolean palin = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palin = false;
                break;
            }
        }

        if (palin == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
