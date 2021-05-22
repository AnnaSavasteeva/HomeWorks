package Java_1.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    final char CHAR_X = 'X';
    final char CHAR_O = 'O';
    final char CHAR_EMPTY = '•';
    final int SIZE = 5;
    final int FULLNESS = 4;
    char[][] GAME_FIELD = new char[SIZE][SIZE];
    Random rand;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }


    public void game() {
        initGameField();
        printGameField();

        while (true) {
            turnHuman();
            if (isHumanWinner()) {
                System.out.println("Человек победил!");
                break;
            }
            if (isGameFieldFull()) {
                printDraw();
                break;
            }

            turnComputer();
            if (isComputerWinner()) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isGameFieldFull()) {
                printDraw();
                break;
            }

            printGameField();
        }

        System.out.println("Игра окончена");
        printGameField();
    }

    private boolean isGameFieldFull() {
        for (char[] curArray: GAME_FIELD) {
            for (char curEl: curArray) {
                if (curEl == CHAR_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private void printDraw() {
        System.out.println("Ничья!");
    }

    private boolean isComputerWinner() {
        return isWinner(CHAR_O);
    }

    private boolean isHumanWinner() {
        return isWinner(CHAR_X);
    }

    private boolean isWinner(char symbol) {
        char[] mainDiagonal = new char[SIZE];
        char[] additionalDiagonal = new char[SIZE];

        for (int i = 0; i < SIZE; i++) {
            char[] horizontally = new char[SIZE];
            char[] vertically = new char[SIZE];

            for (int j = 0; j < SIZE; j++) {
                horizontally[j] = GAME_FIELD[i][j];
                vertically[j] = GAME_FIELD[j][i];
            }

            if (isFieldFull(horizontally, symbol) || isFieldFull(vertically, symbol)) {
                return true;
            } else {
                mainDiagonal[i] = GAME_FIELD[i][i];
                additionalDiagonal[i] = GAME_FIELD[i][GAME_FIELD.length - 1 - i];
            }
        }

        return isFieldFull(mainDiagonal, symbol) || isFieldFull(additionalDiagonal, symbol);
    }

    private boolean isFieldFull(char[] array, char symbol) {
        boolean isFieldFull = false;
        for (int i = 0; i <= array.length - FULLNESS; i++) {
            if (array[i] != CHAR_EMPTY) {
                if(!isFieldFull) {
                    for (int j = i; j < FULLNESS + i; j++) {
                        if (array[j] != symbol) {
                            isFieldFull = false;
                            break;
                        }
                        isFieldFull = true;
                    }
                }
            }
        }
        return isFieldFull;
    }

    private void turnHuman() {
        int x, y;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Введите координаты ячейки в формате X Y: ");
            x = readInt(scanner) - 1;
            y = readInt(scanner) - 1;
        } while (!isCellValid(x, y));

        GAME_FIELD[x][y] = CHAR_X;
    }

    private boolean isCellValid(int x, int y) {
        if (x == -1 || y == -1) {
            System.out.println("Вы ввели ноль или нечисловое значение.");
            return false;
        } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Введенные координаты выходят за границы игрового поля.");
            return false;
        } else if (GAME_FIELD[x][y] != CHAR_EMPTY) {
            System.out.println("Ячейка занята!");
            return false;
        }
        return true;
    }

    private int readInt(Scanner scanner) {
        return scanner.hasNextInt() ? scanner.nextInt() : 0;
    }

    private void turnComputer() {
        boolean isTurnGood = false;
        int x = -1, y = -1;

        for (int i = 0; i < SIZE; i++) {
            if (!isTurnGood) {
                for (int j = 0; j < SIZE; j++) {
                    if (GAME_FIELD[i][j] == CHAR_EMPTY) {
                        GAME_FIELD[i][j] = CHAR_O;
                        if (isWinner(CHAR_O)) {
                            x = i;
                            y = j;
                            isTurnGood = true;
                            break;
                        }

                        GAME_FIELD[i][j] = CHAR_X;
                        if (isWinner(CHAR_X)) {
                            x = i;
                            y = j;
                            isTurnGood = true;
                            break;
                        }

                        GAME_FIELD[i][j] = CHAR_EMPTY;
                    }
                }
            } else {
                break;
            }
        }

        if (!isTurnGood) {
            rand = new Random();
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (GAME_FIELD[x][y] != CHAR_EMPTY);
        }

        GAME_FIELD[x][y] = CHAR_O;
    }

    private void initGameField() {
        for (char[] curArr: GAME_FIELD){
            Arrays.fill(curArr, CHAR_EMPTY);
        }
    }

    private void printGameField() {
        printHeader();
        printBody();
        System.out.println();
    }

    private void printHeader() {
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void printBody() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");

            for (char currSymbol: GAME_FIELD[i - 1]) {
                System.out.print(currSymbol + " ");
            }

            System.out.println();
        }
    }

}
