package Java_2.j2_lesson5;

import java.util.Arrays;

public class MainClass {
    private final static int ARR_SIZE = 10_000_000;
    private final static float FILL = 1.0f;

    public static void main(String[] args) {

        float[] arr1 = ArraysUtil.createAndFillFloatArr(ARR_SIZE, FILL);
        ArraysUtil.processAction(() -> ArraysUtil.modifyFloatArrValues(arr1, 0));

        float[] arr2 = ArraysUtil.createAndFillFloatArr(ARR_SIZE, FILL);
        ArraysUtil.processAction(() -> ArraysUtil.modifyValuesViaThreads(arr2));

        System.out.println("Arrays are equal: " + Arrays.equals(arr1, arr2));

    }

}
