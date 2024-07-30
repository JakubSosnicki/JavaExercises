public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
    public static int getEvenDigitSum (int number) {

        if ( number < 0) {
            return -1;
        }

        int sumEven = 0;

        while (number > 0) {
            int isEven = number % 10;
            if(isEven % 2 == 0){
                sumEven += isEven;
            }
            number = number / 10;
        }
        return sumEven;
    }
}
