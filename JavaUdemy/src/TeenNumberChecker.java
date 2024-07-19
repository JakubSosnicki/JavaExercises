
//We'll say that a number is "teen" if it is in the range 13-19 (inclusive).

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("\n" + isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen (int firNum, int secNum, int thiNum){
        if(firNum>=13 && firNum<=19)
            return true;
        else if(secNum>=13 && secNum<=19)
            return true;
        else
            return thiNum >= 13 && thiNum <= 19;
    }
    public static boolean isTeen(int teen){
        if(teen>=13 && teen<=19)
            return true;
        else
            return false;
    }

}
