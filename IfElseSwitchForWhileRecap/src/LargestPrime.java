public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));

    }
    public static int getLargestPrime(int number) {
        // If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
        if (number < 0)
            return -1;

        if (number == 0 || number == 1)
            return -1;
        int maxPrime = 0;
        for (int i = 2 ; i <= number ; i++){ // i is divider number
            if (number % i == 0){
                int prime = 0;
                for (int j = 1 ; j <= i ; j++){ // j is divider i
                    if( i % j == 0) // if number is divided by j divider count +1
                        prime++;
                }
                if(prime == 2) // prime numbers are divided only by 2 numbers
                    maxPrime = i;
            }
        }
        return maxPrime;

    }
}
