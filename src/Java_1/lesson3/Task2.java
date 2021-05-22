package Java_1.lesson3;

import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) {
        int[] hundredNumbersArray = createNumbersArray(100);
        System.out.println(Arrays.toString(hundredNumbersArray));
    }


    private static int[] createNumbersArray(int arrayLength) {
        int[] numArr = new int[arrayLength];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }

        return numArr;
    }

}
