import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    //circle area
    public static double area(double radius){
        if(radius<0)
            return -1;
        return pow(radius,2)*PI;
    }

    //rectangle area
    public static double area(double x, double y){
        if(x<0 || y<0)
            return -1;
        return x*y;
    }
}
