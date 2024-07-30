public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int result =0;
        int lastDigit = 0;
        int original = number;
        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverse += lastDigit;
            result =reverse;
            reverse *= 10;
        }
        if (original < 0) {
            while (number < 0) {
                lastDigit = number % 10;
                number = number / 10;
                reverse += lastDigit;
                result =reverse;
                reverse *= 10;
            }

        }
        return result == original;
    }
}
