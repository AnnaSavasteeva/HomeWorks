package lesson6;

public class ObjArrays {

    public static void createCatsObjArr(String[][] arr, Animal[] animalArr) {
        for (int animalsCount = 0; animalsCount < arr.length; animalsCount++) {
            animalArr[animalsCount] = new Cat(arr[animalsCount][0]);
        }
    }

    public static void createDogsObjArr(String[][] arr, Animal[] animalArr) {
        for (int animalsCount = 0; animalsCount < arr.length; animalsCount++) {
            animalArr[animalsCount] = new Dog(arr[animalsCount][0]);
        }
    }

    public static void runSwim(Animal[] animals, String[][] animalArray) {
        for (Animal animalObj: animals) {
            for (String[] animal: animalArray) {
                if (animalObj.getName().equals(animal[0])) {
                    animalObj.run(Integer.parseInt(animal[1]));
                    animalObj.swim(Integer.parseInt(animal[2]));
                    break;
                }
            }
            System.out.println("------");
        }
    }

//    public static Animal[] createObjArr(String[][]arr, Animal[] animalArr, Class<?> className) {
//        for (int animalsCount = 0; animalsCount < arr.length; animalsCount++) {
//            animalArr[animalsCount] = className.newInstance();
////            animalArr[animalsCount] = new className(arr[animalsCount][0]);
//        }
//
//        return animalArr;
//    }

}
