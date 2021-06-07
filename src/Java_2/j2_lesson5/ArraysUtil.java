package Java_2.j2_lesson5;

import java.util.Arrays;


public class ArraysUtil {

    public static void processAction(Runnable action) {
        long startTime = System.currentTimeMillis();
        action.run();
        ArraysUtil.printTime(startTime);
    }



    public static void modifyValuesViaThreads(float[] arr) {
//        Делим массив на два массива
        int arrHalfSize = arr.length / 2;
        float[] arrCopy1 = Arrays.copyOfRange(arr, 0, arrHalfSize);
        float[] arrCopy2 = Arrays.copyOfRange(arr, arrHalfSize, arr.length);


//        Модифицируем значения созданных массивов в разных потоках
        Thread thread1 = new Thread (() -> modifyFloatArrValues(arrCopy1, 0));
        Thread thread2 = new Thread (() -> modifyFloatArrValues(arrCopy2, arrHalfSize));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        Объединяем в исходном массиве новые значения
        System.arraycopy(arrCopy1, 0, arr, 0, arrHalfSize);
        System.arraycopy(arrCopy2, 0, arr, arrHalfSize, arrHalfSize);

    }



    public static void modifyFloatArrValues (float[] arr, int offset) {
        for (int i = 0; i < arr.length; i++) {
//            offset нужен из-за того, что значение индекса используется в формуле из computeValue,
//            при этом в методе modifyValuesViaThreads() массив разбивается на два массива и,
//            соответственно, индексация меняется, а нужно, чтобы были задействованы прежние индексы.
            int index = i + offset;
            arr[i] = computeValue(arr[i], index);
        }
    }



    private static float computeValue(float data, int index) {
        return (float)(data * Math.sin(0.2f + index / 5.0) * Math.cos(0.2f + index / 5.0) * Math.cos(0.4f + index / 2.0));
    }



    public static float[] createAndFillFloatArr(int arrSize, float fill) {
        float[] arr = ArraysUtil.createFloatArr(arrSize);
        Arrays.fill(arr, fill);
        return arr;
    }



    private static float[] createFloatArr(int arrSize) {
        return new float[arrSize];
    }



    private static void printTime(long startTime) {
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
