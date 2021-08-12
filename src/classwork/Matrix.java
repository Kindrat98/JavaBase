package classwork;

import java.util.Random;

public class Matrix {

    public static void main(String[] args) {
        Random random = new Random();
        int dim = 2 + random.nextInt(2);
        int[][] matrix = new int[dim][dim];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1000);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" a[" + i + "][" + j + "] = " + matrix[i][j]);
            }
            System.out.println();
        }

        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    result += matrix[i][j];
                }
            }
        }

        System.out.println("Result = " + result);


    }
}
