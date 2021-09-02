package Java_3.j3_lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysUtil {

    public Integer[] getItemsAfterValue(Integer[] array, Integer value) {
        checkArray(array);

        int startIndex = getItemIndex(array, value);
        checkItemIndex(startIndex, "Элемент в массиве не найден: " + value);

        List<Integer> list = new ArrayList<>(Arrays.asList(array).subList(startIndex + 1, array.length));
        return list.toArray(new Integer[0]);
    }



    private void checkArray(Integer[] array) {
        if (array == null) {
            throw new RuntimeException("Переданный массив не содержит элементов");
        }
    }

    private void checkItemIndex(int index, String message) {
        if (index == -1) {
            throw new RuntimeException(message);
        }
    }

    private Integer getItemIndex(Integer[] array, Integer item) {
        int index = -1;

        for (int i = 0; i <  array.length; i++) {
            if (array[i].equals(item)) {
                index = i;
            }
        }

        return index;
    }

}
