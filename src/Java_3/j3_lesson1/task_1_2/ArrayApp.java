package Java_3.j3_lesson1.task_1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayApp {

    private final static String[] letters = {"A", "C", "B"};
    private final static Integer[] numbers = {2, 1, 3};

    private static ArrayList<String> lettersCollection;
    private static ArrayList<Integer> numbersCollection;


    public static void execute() {
        System.out.println("Исходные массивы:");
        printArrays();

        System.out.println(System.lineSeparator());

        System.out.println("Поменяли местами элементы массивов:");
        swapArrElementsAndPrint();

        System.out.println(System.lineSeparator());

        System.out.println("Коллекции на основе массивов:");
        createCollectionsAndPrint();

    }


    private static void createCollectionsAndPrint() {
        lettersCollection = ArraysUtil.createArrayList(letters);
        numbersCollection = ArraysUtil.createArrayList(numbers);
        printCollections();
    }


    private static void printCollections() {
        ArraysUtil.printCollection(lettersCollection);
        ArraysUtil.printCollection(numbersCollection);
    }


    private static void swapArrElementsAndPrint() {
        ArraysUtil.swap(letters, 1, 2);
        ArraysUtil.swap(numbers, 0, 1);
        printArrays();
    }


    private static void printArrays() {
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(numbers));
    }

}
