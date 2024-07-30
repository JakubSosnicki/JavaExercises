public class SharedDigit { //number range <10 ; 99>
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit (int num1, int num2) {

        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99)
            return false;

        int firstnum1=num1 % 10;
        int firstnum2=num2 % 10;
        num1 /= 10;
        num2 /= 10;
        int secondnum1=num1 % 10;
        int secondnum2=num2 % 10;

        return firstnum1 == firstnum2 || firstnum1 == secondnum2 || firstnum2 == secondnum1 || secondnum1 == secondnum2;
    }
}
