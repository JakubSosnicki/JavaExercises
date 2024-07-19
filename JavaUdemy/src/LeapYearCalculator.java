public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
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
}
