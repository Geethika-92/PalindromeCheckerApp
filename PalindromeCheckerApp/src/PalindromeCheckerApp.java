public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madan";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Recursive method
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters are not equal
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}