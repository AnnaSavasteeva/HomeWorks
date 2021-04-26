package lesson3;

import java.util.Arrays;
import java.util.Random;


public class Task6 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] randomNumbersArr = new int[10];

        for (int i = 0; i < randomNumbersArr.length; i++) {
            randomNumbersArr[i] = ran.nextInt(101);
        }

        System.out.println(Arrays.toString(randomNumbersArr));
        System.out.println("Минимальный элемент массива: " + getMinValue(randomNumbersArr));
        System.out.println("Максимальный элемент массива: " + getMaxValue(randomNumbersArr));
    }


    private static int getMinValue(int[] arr) {
//        способ 1*
//        * Исходный массив будет отсортирован! Если это нежелательно,
//        то нужно создавать копию исходника и сортировать уже ее
        Arrays.sort(arr);
        return arr[0];


//        способ 2
//        int minValue = arr[0];
//
//        for (int currEl: arr) {
//            if (currEl < minValue) {
//                minValue = currEl;
//            }
//        }
//        return minValue;


//        способ 3
//        int minValue = arr[0];
//
//        for (int currEl: arr) {
//            minValue = Math.min(minValue, currEl);
//        }
//        return minValue;
    }


    private static int getMaxValue(int[] arr) {
//        способ 1
        Arrays.sort(arr);
        return arr[arr.length - 1];


//        способ 2
//        int maxValue = arr[0];
//
//        for (int currEl: arr) {
//            if (currEl > maxValue) {
//                maxValue = currEl;
//            }
//        }
//        return maxValue;


//        способ 3
//        int maxValue = arr[0];
//
//        for (int currEl: arr) {
//            maxValue = Math.max(maxValue, currEl);
//        }
//        return maxValue;
    }

}
