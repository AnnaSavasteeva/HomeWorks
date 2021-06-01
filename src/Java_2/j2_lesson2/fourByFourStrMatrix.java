package Java_2.j2_lesson2;


public class fourByFourStrMatrix {

    public static int sum(String[][] strMatrix) throws MyArraySizeException, MyArrayDataException {
        MatrixUtil.checkMatrixSize(strMatrix, 4);
        MatrixUtil.checkIsMatrixNumeric(strMatrix);
        return MatrixUtil.sumStrMatrixItems(strMatrix);
    }

}
