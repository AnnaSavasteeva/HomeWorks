package Java_1.lesson3;

public class Task7 {

    public static void main(String[] args) {
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {1, 3, 2}));
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[] {3, 5}));
        System.out.println(checkBalance(new int[] {1, 2, 0, 0, 3}));
    }


    private static boolean checkBalance(int[] arr) {
        boolean result = false;

//        способ 1
        int leftSum = arr[0];
        int rightSum = sum(arr, 1, arr.length);

        for (int i = 1; i < arr.length; i++) {
            if (leftSum == rightSum) {
                result = true;
                break;
            }

            leftSum += arr[i];
            rightSum -= arr[i];
        }

        return result;


//        способ 2
//        int leftSum = 0;
//        int rightSum = sum(arr, 0, arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            leftSum = sum(arr, 0, i);
//            rightSum = sum(arr, i, arr.length);
//
//            if (leftSum == rightSum) {
//                result = true;
//                break;
//            }
//        }
//        return result;

//        способ 3
//        int firstSum = 0;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            firstSum += arr[i];
//
//            int secondSum = 0;
//            for (int j = i + 1; j < arr.length; j++) {
//                secondSum += arr[j];
//            }
//
//            if (firstSum == secondSum) {
//                return true;
//            }
//        }
//        return result;
    }


    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }

        return sum;
    }

}
