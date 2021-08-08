package Java_3.j3_lesson1.task_1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtil {

    public static <T> void swap(T[] items, int index1, int index2) {
        T swap = items[index1];
        items[index1] = items[index2];
        items[index2] = swap;
    }


    public static <T> ArrayList<T> createArrayList(T[] items) {
        return new ArrayList<>(Arrays.asList(items));
    }


    public static <T> void printCollection(ArrayList<T> list) {
        for (T listItem : list) {
            System.out.print(listItem);
        }
        System.out.print(System.lineSeparator());
    }

}
