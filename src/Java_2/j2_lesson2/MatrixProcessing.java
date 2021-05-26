package Java_2.j2_lesson2;


public class MatrixProcessing {

    public static int[][] sumMatrixItems(String[][] stringArray) {
        int[][] intArr = new int[4][4];

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = Integer.parseInt(stringArray[i][j]);
            }
        }

        return intArr;
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

}
