import static java.lang.Math.round;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }
        return round(kilometersPerHour * 0.621);
    }

    public static void printConversion (double kilometersPerHour) {

        if  (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

    }
}
