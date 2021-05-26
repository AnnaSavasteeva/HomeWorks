package Java_2.j2_lesson2;


public class ProcessMatrix {

    public static void processMatrix() {
        String[][] strNumbersMatrix = new String[4][4];
        MatrixUtil.fillStrMatrixWithNumbers(strNumbersMatrix);

        MatrixUtil.printStrMatrix(strNumbersMatrix);

        System.out.println("Сумма элементов матрицы - " + MatrixUtil.sumMatrixItems(strNumbersMatrix, 4));
    }

}
