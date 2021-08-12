package part2;

import java.util.Scanner;

public class OperationLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.next();
//        if(1 == input) {
//            System.out.println("One");
//        }else if (2 == input){
//            System.out.println("Two");
//        }else if (3 == input){
//            System.out.println("Three");
//        }else {
//            System.out.println("Another");
//        }

        switch (input){
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            default:
                System.out.println("Another");
                break;
        }

    }
}
