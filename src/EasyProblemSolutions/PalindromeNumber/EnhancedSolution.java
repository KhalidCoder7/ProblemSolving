package EasyProblemSolutions.PalindromeNumber;

public class EnhancedSolution {
    public static void main(String[] args) {
        int x = 12321;
        isPalindrome(x);
    }
    public static boolean isPalindrome(int x) {
        // Special cases:
        // If x is negative, it cannot be a palindrome
        // If x is a multiple of 10 (except for 0), it cannot be a palindrome
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversedNumber = 0;
        // Reverse the second half of the number
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }

        // For even-digit numbers, x == reversedNumber.
        // For odd-digit numbers, x == reversedNumber / 10.
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
