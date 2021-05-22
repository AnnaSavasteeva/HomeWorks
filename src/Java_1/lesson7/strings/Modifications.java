package Java_1.lesson7.strings;

import java.util.Scanner;


public class Modifications {

    public static void main(String[] args) {
        String userStr;

        System.out.println("Введите строку: ");
        userStr = getUserString();
        System.out.println("------");

        getLastChar(userStr);
        System.out.println("------");

        strEnds(userStr);
        System.out.println("------");

        strStarts(userStr);
        System.out.println("------");

        isSubstringInString(userStr);
        System.out.println("------");

        System.out.println("Строка с новыми символами: " + replaceChars(userStr));
        System.out.println("------");

        System.out.println("Строка в верхнем регистре: " + userStr.toUpperCase());
        System.out.println("------");

        System.out.println("Строка в нижнем регистре: " + userStr.toLowerCase());
        System.out.println("------");

        System.out.println(cutSubStr(userStr));

    }


    public static String cutSubStr(String searchString) {
        Scanner scanner = new Scanner(System.in);
        String subStr;

        System.out.println("Укажите, какой текст нужно вырезать:");
        subStr = scanner.nextLine();
        if (searchString.contains(subStr)) {
            int cutStart = searchString.indexOf(subStr);
            return searchString.substring(0, cutStart) + searchString.substring(cutStart + subStr.length());
        } else {
            return "Такой текст не найден";
        }
    }

    public static String replaceChars(String searchString) {
        Scanner scanner = new Scanner(System.in);
        String newStr;
        String oldChar;
        String newChar;

        System.out.println("Укажите символ для замены:");
        oldChar = scanner.nextLine();

        if (searchString.contains(oldChar)) {
            System.out.println("Укажите, на какой символ его заменить:");
            newChar = scanner.nextLine();
            newStr = searchString.replace(oldChar, newChar);
            return newStr;
        } else {
            System.out.println("Такого символа нет в строке");
            return replaceChars(searchString);
        }
    }

    public static void isSubstringInString(String searchString) {
        Scanner scanner = new Scanner(System.in);
        String subStr;

        System.out.println("Укажите, наличие какой подстроки нужно проверить:");
        subStr = scanner.nextLine();
        if (searchString.contains(subStr)) {
            System.out.println("Подстрока '" + subStr + "' есть в строке и начинается с позиции " + searchString.indexOf(subStr));
        } else {
            System.out.println("Подстрока '" + subStr + "' не найдена");
        }
    }

    public static void strStarts(String searchString) {
        Scanner scanner = new Scanner(System.in);
        String strStart;

        System.out.println("Укажите, на что нужно проверить начало строки:");
        strStart = scanner.nextLine();

        String message = "Строка начинается с '" + strStart + "'? ";
        message += (searchString.startsWith(strStart)) ? "Да!" : "Нет!";
        System.out.println(message);
    }

    public static void strEnds(String searchString) {
        Scanner scanner = new Scanner(System.in);
        String strEnd;

        System.out.println("Укажите, на что нужно проверить окончание строки:");
        strEnd = scanner.nextLine();

        String message = "Строка заканчивается на '" + strEnd + "'? ";
        message += (searchString.endsWith(strEnd)) ? "Да!" : "Нет!";
        System.out.println(message);
    }

    public static void getLastChar(String searchString) {
        System.out.println(searchString.charAt(searchString.length() - 1));
    }

    public static String getUserString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
