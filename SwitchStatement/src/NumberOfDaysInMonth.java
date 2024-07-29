public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2024);
        isLeapYear(2000);
        int days=getDaysInMonth(1, 2020);
        System.out.println("Number of days: " + days);
        days=getDaysInMonth(2, 2020);
        System.out.println("Number of days: " + days);
        days=getDaysInMonth(2, 2018);
        System.out.println("Number of days: " + days);
        days=getDaysInMonth(-1, 2020);
        System.out.println("Number of days: " + days);
        days=getDaysInMonth(1, -2020);
        System.out.println("Number of days: " + days);
    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999)
            return false; //incorrect year

        if(year % 4 == 0){
            if(year % 100 != 0)
                return true; //is a leap year; divide by 4 but not 100
            else if(year % 400 == 0)
                return true; //is leap year; divide by 4, 100, 400
            else
                return false; //is not leap year
        }else
            return false; // is not a leap year
    }
    public static int getDaysInMonth(int month, int year) {
        // checking the parameters
        if (month < 1 || month > 12)
            return -1; //incorrect month
        if (year < 1 || year > 9999)
            return -1; //incorrect year

        //main part of method
        boolean resultLeapYear = isLeapYear(year);
        if (resultLeapYear == true) {
            return switch (month) {
                case 2 -> 29;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };
        } else {
            return switch (month) {
                case 2 -> 28;
                case  4, 6, 9, 11 -> 30;
                default -> 31;
            };
        }

    }
}

