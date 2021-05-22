package Java_1.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
//      Для задачи 3
        HomeWorkApp testObject = new HomeWorkApp();
        int a = 1, b = 4;

//        Задача 2
        printThreeWords();

//        Задача 3
        testObject.checkSumSign(a, b);
        testObject.checkSumSign(-3, -2);

//        Задача 4
        printColor(-8);

//        Задача 5
        compareNumbers(-4, -7);

    }



    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};

        for (String word: words) {
            System.out.println(word);
        }
    }



    public void checkSumSign(int a, int b) {
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная: " + sum);
        } else {
            System.out.println("Сумма отрицательная: " + sum);
        }
    }



    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if ( value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }



    public static void compareNumbers(int a, int b) {
        String message;
        message = (a >= b) ? (a + " >= " +  b) : (a + " < " +  b);

        System.out.println(message);
    }

}
