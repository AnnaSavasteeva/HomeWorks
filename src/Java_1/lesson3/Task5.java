package Java_1.lesson3;

import java.util.Arrays;
import java.util.Random;


public class Task5 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] initializedArr;
        int len;
        int initialValue;

        len = ran.nextInt(5) + 1;
        initialValue = ran.nextInt(101);
        System.out.println("Длина массива: " + len + "\nЗначение всех элементов: " + initialValue);

        initializedArr = createInitArray(len, initialValue);
        System.out.println(Arrays.toString(initializedArr));
    }


    private static int[] createInitArray(int len, int initialValue) {
        int[] arr = new int[len];

//        способ 1
        Arrays.fill(arr, initialValue);
        return arr;

//        способ 2
//        for(int i =0; i < len; i++) {
//            arr[i] = initialValue;
//        }
//        return arr;
    }

}
