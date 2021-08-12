package hw1;

import java.util.Scanner;

public class StringCut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fromCut = scanner.next();
        String toCut = scanner.next();
        String result = fromCut.replaceAll(toCut, "");
        System.out.println(result);
    }
}
