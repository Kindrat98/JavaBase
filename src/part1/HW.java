package part1;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int a:");
        int a = scanner.nextInt();
        System.out.println("Enter int b:");
        int b = scanner.nextInt();
        System.out.println("Enter int c:");
        int c = scanner.nextInt();
        double square = getGeronSquare(a, b, c);
    }

    public static double getGeronSquare(double a, double b, double c){
        double x = ((a + b + c)/2);
        return Math.sqrt(x * (x - a) * (x - b) * (x - c));
    }
}
