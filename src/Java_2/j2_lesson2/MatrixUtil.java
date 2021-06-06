package Java_2.j2_lesson2;


import java.util.Arrays;

public class MatrixUtil {

    public static void checkMatrixSize(String[][] strMatrix, int matrixSize) throws MyArraySizeException {

        if (strMatrix.length != matrixSize) {
            throw new MyArraySizeException(strMatrix.length);
        }

        for (int innerArr = 0; innerArr < strMatrix.length; innerArr++) {
            if (strMatrix[innerArr].length != matrixSize) {
                throw new MyArraySizeException(strMatrix.length, innerArr, strMatrix[innerArr].length);
            }
        }

    }


    public static void checkIsMatrixNumeric(String[][] strMatrix) throws MyArrayDataException {

        for (int outerArr = 0; outerArr < strMatrix.length; outerArr++) {

            for (int innerArr = 0; innerArr < strMatrix[outerArr].length; innerArr++) {
                try {
                    Integer.parseInt(strMatrix[outerArr][innerArr]);
                } catch(NumberFormatException e) {
                    throw new MyArrayDataException(outerArr, innerArr, strMatrix[outerArr][innerArr]);
                }
            }

        }

    }


    public static int sumStrMatrixItems(String[][] strMatrix) {
        int sum = 0;

        for (String[] strArr : strMatrix) {
            for (String strItem : strArr) {
                sum += Integer.parseInt(strItem);
            }

        }

        return sum;
    }


    public static void printStrMatrix(String[][] strMatrix) {
        for (String[] strNumbers : strMatrix) {
            System.out.println(Arrays.toString(strNumbers));
        }
    }


    public static void fillStrMatrixWithNumbers(String[][] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            int lastNumber = (i != 0) ? Integer.parseInt(strArr[i - 1][strArr[i - 1].length - 1]) : 0;
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = Integer.toString(lastNumber + 1);
                lastNumber++;
            }
        }
    }

}
