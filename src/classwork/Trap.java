package classwork;

public class Trap {
    public static void main(String[] args) {
        double a = 4.4;
        double b = 6.7;
        double h = 3.0;

        double square = getSquare(a, b, h);
    }

    public static double getSquare(double a, double b, double h){
        return (a + b)*h/2;
    }
}
