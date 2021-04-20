package lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {

//        Для всех задач
        Scanner userInput = new Scanner(System.in);
        HomeWorkApp2 processInput = new HomeWorkApp2();
//        Для задачи 1
        int firstTaskNumber1;
        int firstTaskNumber2;
        boolean checkResult;
//        Для задачи 2
        int secondTaskNumber;
//        Для задачи 3
        int thirdTaskNumber;
//        Для задачи 4
        String userString;
        int userCopiesInt;
//        Для задачи 5
        int userYear;
        boolean isViscose;


//        Задача 1
        System.out.println("Задача 1\nВведите первое число: ");
        firstTaskNumber1 = userInput.nextInt();

        System.out.println("Введите второе число: ");
        firstTaskNumber2 = userInput.nextInt();

        checkResult = processInput.isNumberInRange(firstTaskNumber1, firstTaskNumber2);

        if (checkResult) {
            System.out.println("Сумма чисел лежит в пределах от 10 до 20 включительно.");
        } else {
            System.out.println("Сумма чисел находится за пределами диапазона.");
        }


//        Задача 2
        System.out.println("Задача 2\nВведите число: ");
        secondTaskNumber = userInput.nextInt();

        processInput.isNumberPositive(secondTaskNumber);


//        Задача 3
        System.out.println("Задача 3\nВведите число: ");
        thirdTaskNumber = userInput.nextInt();

        if (processInput.isNumberNegative(thirdTaskNumber)) {
            System.out.println("Число " + thirdTaskNumber + " - отрицательное.");
        } else {
            System.out.println("Число " + thirdTaskNumber + " - положительное.");
        }


//        Задача 4
        System.out.println("Задача 4\nВведите текст: ");
        userString = userInput.next();

        System.out.println("Укажите, сколько раз нужно вывести текст: ");
        userCopiesInt = userInput.nextInt();

        processInput.printString(userString, userCopiesInt);


//        Задача 5
        System.out.println("Введите год: ");
        userYear = userInput.nextInt();
        isViscose = processInput.isYearViscose(userYear);

        if (userYear > 0) {
            if (isViscose) {
                System.out.println(userYear + " год - високосный.");
            } else {
                System.out.println(userYear + " год не является високосным.");
            }
        } else {
            System.out.println("Такого года не существует.");
        }

    }



    public boolean isNumberInRange(int firstNumber, int secondNumber) {
        int sum;
        sum = firstNumber + secondNumber;
        return sum >= 10 && sum <=20;
    }



    public void isNumberPositive(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " - положительное.");
        } else {
            System.out.println("Число " + number + " - отрицательное.");
        }
    }



    public boolean isNumberNegative(int number) {
        return number < 0;
    }



    public void printString(String userStr, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println(userStr);
        }
    }


    public boolean isYearViscose(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
