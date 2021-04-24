package lesson3;

import java.util.Arrays;


public class Task3 {

    public static void main(String[] args) {
        int[] numbersArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(numbersArr));

        doubleNumbers(numbersArr);
        System.out.println(Arrays.toString(numbersArr));
    }


    private static int[] doubleNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        return array;
    }

}
