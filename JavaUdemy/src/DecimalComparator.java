

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secNum){
        //my working version
//        firstNum=firstNum*1000;
//        secNum=secNum*1000;
//
//        firstNum=(long)firstNum;
//        secNum=(long)secNum;
//
//
//       if (firstNum==secNum)
//           return true;
//       else
//           return false;
//
       //simply version
        firstNum= (long) (firstNum*1000);
        secNum= (long) (secNum*1000);

        return firstNum==secNum; // return true or false depends of result






    }
}



