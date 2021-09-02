package Java_3.j3_lesson6;

import java.util.Arrays;

public class AppExecution {

    public static void main(String[] args) {
        ArraysUtil process = new ArraysUtil();

        System.out.println("Task 1");
        Integer[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Integer[] newArr = process.getItemsAfterValue(arr, 4);
        System.out.println(Arrays.toString(newArr));

        System.out.println("---------");
        System.out.println("Task 2");
        Integer[] numArr1 = {1, 1, 1, 4, 4, 1, 4, 4};
        Integer[] numArr2 = {1, 1, 1, 4, 4, 1, 4, 4, 3};
        System.out.println(process.checkNumbersInArray(numArr1, 1, 4));
        System.out.println(process.checkNumbersInArray(numArr2, 1, 4));
        System.out.println(process.checkNumbersInArray(null, 1, 4));
    }

}
