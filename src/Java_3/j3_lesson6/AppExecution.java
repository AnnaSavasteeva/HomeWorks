package Java_3.j3_lesson6;

import java.util.Arrays;

public class AppExecution {

    public static void main(String[] args) {
        ArraysUtil process = new ArraysUtil();

        Integer[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Integer[] newArr = process.getItemsAfterValue(arr, 4);
        System.out.println(Arrays.toString(newArr));
    }

}
