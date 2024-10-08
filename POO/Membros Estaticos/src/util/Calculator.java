package util;

public class Calculator {

    public static final double PI = 3.14;

    public static double volume(double radius){ //V = 4/3 π r³
        return 4.0 * PI * radius * radius * radius/ 3.0;
    }
    public static double circumference(double radius){
        return 2.0 * radius * PI;
    }
}
