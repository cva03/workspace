package temp;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int original = x;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;
    }
}
