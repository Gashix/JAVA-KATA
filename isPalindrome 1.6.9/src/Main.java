public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("popopz"));
    }

    public static boolean isPalindrome(String text) {
        String s = text.replaceAll("[^a-zA-Z0-9]", "");
        boolean b = false;
        StringBuilder norm = new StringBuilder(s);
        StringBuilder reverse = norm.reverse();
        String boba = reverse.toString();
        if (s.equalsIgnoreCase(boba)) {
            b = true;
        }
        return b;
    }
}