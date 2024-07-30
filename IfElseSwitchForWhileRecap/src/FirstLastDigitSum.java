public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = number%10;
        number = number /10;

        if (number==0){
            sum = sum*2;
            return sum;
        }


        while (number > 0) {
            if (number >= 1 && number <= 9)
                sum += number % 10;
            number = number / 10;

        }
        return sum;
    }
}
