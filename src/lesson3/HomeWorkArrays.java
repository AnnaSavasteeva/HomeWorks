package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkArrays {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] hundredNumbersArray; //для задачи 2
        int[] numbersArr; //для задачи 3
        int[] filledArr; //для задачи 5
        int[] randomNumbersArr; //для задачи 6
        int[] balancedArr; //для задачи 7
        int[] offsetArr; //для задачи 8


//        1
        System.out.println("--- 1 ---");
        invertArrayValues();

//        2
        System.out.println("\n--- 2 ---");
        hundredNumbersArray = createNumbersArray(100);
        System.out.println(Arrays.toString(hundredNumbersArray));

//        3
        System.out.println("\n--- 3 ---");
        numbersArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleNumbers(numbersArr);
        System.out.println(Arrays.toString(numbersArr));

//        4
        System.out.println("\n--- 4 ---");
        fillMatrixDiagonally();

//        5
        System.out.println("\n--- 5 ---");
        filledArr = createFilledArray(ran.nextInt(5) + 1, ran.nextInt(101));
        System.out.println(Arrays.toString(filledArr));

//        6
        System.out.println("\n--- 6 ---");

        randomNumbersArr = new int[10];
        for (int i = 0; i < randomNumbersArr.length; i++) {
            randomNumbersArr[i] = ran.nextInt(101);
        }

        System.out.println(Arrays.toString(randomNumbersArr));
        System.out.println("Минимальный элемент массива: " + getMinValue(randomNumbersArr));
        System.out.println("Максимальный элемент массива: " + getMaxValue(randomNumbersArr));

//        7
        System.out.println("\n--- 7 ---");
        balancedArr = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(balancedArr));

//        8
        System.out.println("\n--- 8 ---");

        offsetArr = new int[] {3, 5, 6, 1};
        int userOffset = -2;

        System.out.println("Initial Array: " + Arrays.toString(offsetArr));
        System.out.println("Offset: " + userOffset);

        offsetArr = offsetArrayElements(offsetArr, userOffset);

        System.out.println("Final Array: " + Arrays.toString(offsetArr));

    }



    private static void invertArrayValues() {
        int[] zeroOneArray = new int[] {1, 0, 0, 1, 0, 1, 1, 1, 0, 1};

        System.out.println(Arrays.toString(zeroOneArray));

        for(int i = 0; i < zeroOneArray.length; i++) {
            zeroOneArray[i] = (zeroOneArray[i] == 1) ? 0 : 1;
        }

        System.out.println(Arrays.toString(zeroOneArray));
    }



    private static int[] createNumbersArray(int arrayLength) {
        int[] numArr = new int[arrayLength];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }

        return numArr;
    }



    private static int[] doubleNumbers(int[] array) {
        for (int i =0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }



    private static void fillMatrixDiagonally() {
        int[][] matrix = new int[4][4];

        for(int[] curArr: matrix) {
            System.out.println(Arrays.toString(curArr));
        }

        for(int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }

        System.out.println();

        for(int[] currArr: matrix) {
            System.out.println(Arrays.toString(currArr));
        }
    }



    private static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];

        for(int i =0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }



    private static int getMinValue(int[] arr) {
        int minValue = arr[0];

        for (int currEl: arr) {
            if (currEl < minValue) {
                minValue = currEl;
            }
        }

        return minValue;
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];

        for (int currEl: arr) {
            if (currEl > maxValue) {
                maxValue = currEl;
            }
        }

        return maxValue;
    }



    private static boolean checkBalance(int[] arr) {
        int firstSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            firstSum += arr[i];

            int secondSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                secondSum += arr[j];
            }

            if (firstSum == secondSum) {
                return true;
            }
        }

        return false;
    }



    private static int[] offsetArrayElements(int[] offsetArray, int offset) {
        int offsetAbs = Math.abs(offset);

        if (offset != 0) {
            for (int i = 1; i <= offsetAbs; i++) {
                if (offset > 0) {
                    for (int j = 0; j < offsetArray.length; j++) {
                        int currentElValue = offsetArray[j];
                        int lastElValue = offsetArray[offsetArray.length - 1];

                        offsetArray[j] = lastElValue;
                        offsetArray[offsetArray.length - 1] = currentElValue;
                    }
                } else {
                    for (int j = offsetArray.length - 1; j >= 0; j--) {
                        int currentElValue = offsetArray[j];
                        int firstElValue = offsetArray[0];

                        offsetArray[j] = firstElValue;
                        offsetArray[0] = currentElValue;
                    }
                }
            }
        }

        return offsetArray;
    }

}
