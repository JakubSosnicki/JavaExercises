public class SumOddRange {
    public static void main(String[] args) {
        int result=sumOdd(1, 100);
        System.out.println("The odd numbers sum is: " + result);
        result=sumOdd(-1, 100);
        System.out.println("The odd numbers sum is: " + result);
        result=sumOdd(100, 100);
        System.out.println("The odd numbers sum is: " + result);
        result=sumOdd(13, 13);
        System.out.println("The odd numbers sum is: " + result);
        result=sumOdd(100, -100);
        System.out.println("The odd numbers sum is: " + result);
        result=sumOdd(100, 1000);
        System.out.println("The odd numbers sum is: " + result);
    }
    public static boolean isOdd (int number) {
        if(number > 0)
            return number % 2 != 0;

        return false;


    }

    public static int sumOdd (int start, int end) {
        int oddSum = 0;
        if(start > end || start<=0)
            return -1;

        for (int i = start ; i <= end ; i ++) {
            if(isOdd(i))
                oddSum = oddSum + i;
        }
        return oddSum;
    }
}

