public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(1));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords (int number) {
       //If the number is negative, print "Invalid Value".
       if (number < 0)
           System.out.println("Invalid Value");

       int countDigit = getDigitCount(number);
       number = reverse(number); //reverse the number to fix method logic



       while (countDigit > 0) {
           int digit = number % 10; //last digit

           switch (digit) {
               case 0 -> System.out.print("Zero ");
               case 1 -> System.out.print("One ");
               case 2 -> System.out.print("Two ");
               case 3 -> System.out.print("Three ");
               case 4 -> System.out.print("Four ");
               case 5 -> System.out.print("Five ");
               case 6 -> System.out.print("Six ");
               case 7 -> System.out.print("Seven ");
               case 8 -> System.out.print("Eight ");
               case 9 -> System.out.print("Nine ");
           }
           number /= 10; //remove  last digit
           countDigit--;
       }
        System.out.println(" ");

    }

    public static int reverse (int number) {
        int numberReversed = number % 10;
        if(number < 0)
            while (number < 0){
                numberReversed *= 10;
                number /=10;
                numberReversed = numberReversed + number % 10;
            }
        else
            while (number > 0){
                numberReversed *= 10;
                number /=10;
                numberReversed = numberReversed + number % 10;
            }
        numberReversed /= 10;
        return numberReversed;
    }

    public static int getDigitCount (int number) {
        // f the number is negative, return -1 to indicate an invalid value.
        if (number < 0)
            return -1;

        //number = 0; countDigits = 1;
        if (number == 0)
            return 1;

        int countDigits = 0;



        for (int i = 1 ; i <= number ; i *= 10){
            countDigits++;
        }


        return countDigits;
    }
}
