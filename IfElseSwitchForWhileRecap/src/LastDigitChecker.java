public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
       // Each number should be within the range of 10 (inclusive) - 1000 (inclusive)
        if (!isValid(num1))
            return false;

        if (!isValid(num2))
            return false;

        if (!isValid(num3))
            return false;


        if(num1 % 10 == num2 % 10)
            return true;
        if(num2 % 10 == num3 % 10)
            return true;
        if(num1 % 10 == num3 % 10)
            return true;
        return false;
    }
    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }
}
