import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;
        System.out.println("To quit press not an integer");
        while (true) {
            System.out.println("Enter a Integer number:");
            String data = sc.nextLine();
            try {
                int numberInt = Integer.parseInt(data);
                sum += numberInt;
                count++;

            } catch (NumberFormatException e) {
                break;
            }

        }



        if(count > 0)
            average = Math.round((double)sum / count);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
