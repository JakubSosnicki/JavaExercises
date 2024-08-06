public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        // The method should return the greatest common divisor of the two numbers (int)

        //If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        if (first < 10 || second < 10)
            return -1;

        int greatest = 0;
        for (int i = 1 ; i <= first || i <= second; i++){
            if(first % i == 0 && second % i == 0) {
                greatest = i; //the greatest common division is safe here!
            }
        }
        return greatest;
    }
}
