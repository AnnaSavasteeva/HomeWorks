package Java_1.lesson3;

import java.util.Arrays;


public class Task1 {
    
    public static void main(String[] args) {
        int[] zeroOneArr = new int[] {1, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        System.out.println(Arrays.toString(zeroOneArr));

        invertArray(zeroOneArr);
        System.out.println(Arrays.toString(zeroOneArr));
    }


    private static void invertArray(int[] numbersArr) {
        for(int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = (numbersArr[i] == 1) ? 0 : 1;
        }
    }
    
}
