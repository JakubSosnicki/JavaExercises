public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else{
            long hours = minutes / 60;
            long days = hours / 24;
            long remainderDays = days % 365;
            long years = days / 365;
            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }

    }
}
