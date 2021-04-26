package lesson3;

import java.util.Arrays;


public class Task8 {

    public static void main(String[] args) {
        int[] offsetArr = new int[] {3, 5, 6, 1};
        int userOffset = -3;

        System.out.println("Initial Array: " + Arrays.toString(offsetArr));
        System.out.println("Offset: " + userOffset);

        offsetArrayElements(offsetArr, userOffset);

        System.out.println("Final Array: " + Arrays.toString(offsetArr));
    }


    private static void offsetArrayElements(int[] offsetArray, int offset) {
        int offsetAbs = Math.abs(offset);
        int length = offsetArray.length;
        int reminder = offset % length;

        if (reminder > 0) {
            offsetRight(offsetArray, offsetAbs);
        } else if (reminder < 0) {
            offsetLeft(offsetArray, offsetAbs);
        }
    }


    private static void offsetRight(int[] array, int offset) {
        int length = array.length;

        for (int i = 0; i < offset; i++) {
//            способ 1:
//            - последнее значение фиксируем в переменной,
//            - сдвигаем каждое значение на следующую позицию: присваиваем текущему значению предыдущее,
//            - послдений сдвиг - это присваивание значения 1-му индексу,
//            - нулевому индексу присваиваем сохраненное ранее последнее значение.
            int lastValue = array[length - 1];

            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;

//            способ 2
//            for (int j = 0; j < length; j++) {
//                int currentValue = array[j];
//                int lastValue = array[length - 1];
//
//                array[j] = lastValue;
//                array[length - 1] = currentValue;
//            }
        }
    }


    private static void  offsetLeft(int[] array, int offset) {
        int length = array.length;

        for (int i = 0; i < offset; i++) {
//            способ 1: тот же принцип, что и у offsetRight()
            int firstValue = array[0];

            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = firstValue;

//            способ 2
//            for (int j = length - 1; j >= 0; j--) {
//                int currentValue = array[j];
//                int firstValue = array[0];
//
//                array[j] = firstValue;
//                array[0] = currentValue;
//            }
        }
    }

}
