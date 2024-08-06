public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber (int number) {
        //A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
        //If number is < 1, the method should return false
        if (number < 1)
            return false;

        int sum = 0;
        for (int i = 1 ; i < number ; i++){
            if ( number % i == 0)
                sum += i;
        }
        return sum == number;
    }
}
