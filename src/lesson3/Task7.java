package lesson3;

public class Task7 {

    public static void main(String[] args) {
        int[] balancedArr1 = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        int[] balancedArr2 = new int[] {1, 3, 2};

        System.out.println(checkBalance(balancedArr1));
        System.out.println(checkBalance(balancedArr2));
    }


    private static boolean checkBalance(int[] arr) {
        boolean result = false;

//        способ 1
        int leftSum = arr[0];
        int rightSum = 0;
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 1; i < arr.length;i++) {
            if (leftSum == rightSum) {
                result = true;
                break;
            }

            leftSum += arr[i];
            rightSum -= arr[i];
        }

        return result;

//        способ 2
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

}
