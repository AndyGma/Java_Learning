package Les4.debugging;

public class Palindromes {

    private static boolean isPalindrome (String text){
        String normalizedText = normalize(text);
        return normalizedText.equals(reverse(normalizedText));
    }

    private static String normalize(String text) {
        return text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < sb.length() / 2; i++) {
//            int j = sb.length() - 1 - i;
//            char tmp = sb.charAt(i);
//            sb.setCharAt(i, sb.charAt(j));
//            sb.setCharAt(j, tmp);
//        }
//        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(("Madam, I'm Adam")));
    }

}
