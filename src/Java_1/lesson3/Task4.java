package Java_1.lesson3;

import java.util.Arrays;


public class Task4 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for(int[] curArr: matrix) {
            System.out.println(Arrays.toString(curArr));
        }
        System.out.println();

        fillMatrixDiagonally(matrix);

        for(int[] currArr: matrix) {
            System.out.println(Arrays.toString(currArr));
        }
    }


    private static int[][] fillMatrixDiagonally(int[][] array) {
        int lastIndex = array.length - 1;

        for(int i = 0; i <= lastIndex; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
        }

        return array;
    }

}
