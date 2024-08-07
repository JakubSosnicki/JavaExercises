public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
    }
    public static boolean canPack (int bigCount, int smallCount,int goal) {
//        The parameter bigCount represents the count of big flour bags (5 kilos each).
//        The parameter smallCount represents the count of small flour bags (1 kilo each).
//        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
        if(goal < 0 )
            return false;
        int bigKg = bigCount * 5;
       int sum = bigKg + smallCount;
        if (sum < goal)
            return false;

        if (bigKg == goal)
            return true;

        if(smallCount >= goal && smallCount-goal < 5 ) {
            return true;
        }

        int small = goal % 5;

        return small <= smallCount;


    }
}
