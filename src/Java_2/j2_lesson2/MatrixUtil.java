package Java_2.j2_lesson2;


import java.util.Arrays;

public class MatrixUtil {

    public static int sumMatrixItems(String[][] matrixArray, int matrixSizeLimit) {
        int sum = 0;

        for (int i = 0; i < matrixSizeLimit; i++) {
            for (int j = 0; j < matrixSizeLimit; j++) {
                sum += Integer.parseInt(matrixArray[i][j]);
            }
        }

        return sum;
    }


    public static String[][] fillStrMatrixWithNumbers(String[][] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            int lastNumber = (i != 0) ? Integer.parseInt(strArr[i - 1][strArr.length - 1]) : 0;
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = Integer.toString(lastNumber + 1);
                lastNumber++;
            }
        }

        return strArr;
    }


    public static void printStrMatrix(String[][] strMatrix) {
        for (String[] strNumbers : strMatrix) {
            System.out.println(Arrays.toString(strNumbers));
        }
    }

}
