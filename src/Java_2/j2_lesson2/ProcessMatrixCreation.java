package Java_2.j2_lesson2;

import java.util.Arrays;

public class ProcessMatrixCreation {

    public static void createStrMatrix() {
        String[][] strNumbers = new String[4][4];
        MatrixProcessing.fillStrMatrixWithNumbers(strNumbers);

        for (String[] strArr : strNumbers) {
            System.out.println(Arrays.toString(strArr));
        }
    }

}
