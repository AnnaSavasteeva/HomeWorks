package lesson3;

import java.util.Arrays;


public class Task8 {

    public static void main(String[] args) {
        int[] offsetArr = new int[] {3, 5, 6, 1};
        int userOffset = 3;

        System.out.println("Initial Array: " + Arrays.toString(offsetArr));
        System.out.println("Offset: " + userOffset);

        offsetArrayElements(offsetArr, userOffset);

        System.out.println("Final Array: " + Arrays.toString(offsetArr));
    }


    private static void offsetArrayElements(int[] offsetArray, int offset) {
        int offsetAbs = Math.abs(offset);
        int length = offsetArray.length;
        int reminder = offset % length;

        if (reminder != 0) {
            if (offset > 0) {
                for (int i = 0; i < offsetAbs; i++) {
                    for (int j = 0; j < length; j++) {
                        int currentValue = offsetArray[j];
                        int lastValue = offsetArray[length - 1];

                        offsetArray[j] = lastValue;
                        offsetArray[length - 1] = currentValue;
                    }
                }
            } else {
                for (int i = 0; i < offsetAbs; i++) {
                    for (int j = length - 1; j >= 0; j--) {
                        int currentValue = offsetArray[j];
                        int firstValue = offsetArray[0];

                        offsetArray[j] = firstValue;
                        offsetArray[0] = currentValue;
                    }
                }
            }
        }

    }

}
