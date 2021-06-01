package Java_2.j2_lesson2;

import java.util.Random;


public class ProcessMatrix {

    public static void processMatrix() {
        Random rand = new Random();

        String[][] strMatrix4x4 = new String[4][4];
        String[][] strMatrix3x4 = new String[3][4];
        String[][] strMatrix4x3 = new String[4][3];
        String[][] strMatrixInvalidFormat = new String[4][4];

        MatrixUtil.fillStrMatrixWithNumbers(strMatrix4x4);
        MatrixUtil.fillStrMatrixWithNumbers(strMatrix3x4);
        MatrixUtil.fillStrMatrixWithNumbers(strMatrix4x3);

        MatrixUtil.fillStrMatrixWithNumbers(strMatrixInvalidFormat);
        int randRow;
        int randCol;
        randRow = rand.nextInt(strMatrixInvalidFormat.length);
        randCol = rand.nextInt(strMatrixInvalidFormat.length);
        strMatrixInvalidFormat[randRow][randCol] = "Some awesome text";


        MatrixUtil.printStrMatrix(strMatrix4x4);
        System.out.println("------");
        MatrixUtil.printStrMatrix(strMatrix3x4);
        System.out.println("------");
        MatrixUtil.printStrMatrix(strMatrix4x3);
        System.out.println("------");
        MatrixUtil.printStrMatrix(strMatrixInvalidFormat);
        System.out.println("------");


        try {
            System.out.println(fourByFourStrMatrix.sum(strMatrix4x4));
            System.out.println(fourByFourStrMatrix.sum(strMatrix3x4));
            System.out.println(fourByFourStrMatrix.sum(strMatrix4x3));
            System.out.println(fourByFourStrMatrix.sum(strMatrixInvalidFormat));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

}
