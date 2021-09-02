package Java_3.j3_lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysUtil {

    public Integer[] getItemsAfterValue(Integer[] array, int value) {
        checkArray(array);

        int startIndex = getItemIndex(array, value);
        checkItemIndex(startIndex, "Элемент в массиве не найден: " + value);

        List<Integer> list = new ArrayList<>(Arrays.asList(array).subList(startIndex + 1, array.length));
        return list.toArray(new Integer[0]);
    }


    public boolean checkNumbersInArray(Integer[] arr, int firstNumber, int secondNumber) {
        checkArray(arr);

        if (!(isNumberInArray(arr, firstNumber) && isNumberInArray(arr, secondNumber))) {
            return false;
        }

        return isNoOtherNumbers(arr, firstNumber, secondNumber);
    }


//    General
    private void checkArray(Integer[] array) {
        if (array == null) {
            throw new RuntimeException("Переданный массив отсутствует");
        }
    }


//    Task 1
    private void checkItemIndex(int index, String message) {
        if (index == -1) {
            throw new RuntimeException(message);
        }
    }

    private int getItemIndex(Integer[] array, int item) {
        int index = -1;

        for (int i = 0; i <  array.length; i++) {
            if (array[i].equals(item)) {
                index = i;
            }
        }

        return index;
    }


//    Task 2
    private boolean isNumberInArray(Integer[] arr, int number) {
        return Arrays.binarySearch(arr, number) >= 0;
    }

    private boolean isNoOtherNumbers(Integer[] arr, int firstNumber, int secondNumber) {
        for (int number : arr) {
            if (number != firstNumber && number != secondNumber) {
                return false;
            }
        }

        return true;
    }

}
