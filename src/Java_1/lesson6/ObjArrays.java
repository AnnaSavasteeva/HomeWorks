package Java_1.lesson6;


public class ObjArrays {

    public static void createCatsObjArr(String[] arr, Animal[] animalArr) {
        for (int animalIndex = 0; animalIndex < arr.length; animalIndex++) {
            animalArr[animalIndex] = new Cat(arr[animalIndex]);
        }
    }

    public static void createDogsObjArr(String[] arr, Animal[] animalArr) {
        for (int animalIndex = 0; animalIndex < arr.length; animalIndex++) {
            animalArr[animalIndex] = new Dog(arr[animalIndex]);
        }
    }

    public static void runData(Animal[] animals, int[] distance) {
        for(int i = 0; i < animals.length; i++) {
            animals[i].run(distance[i]);
        }
        System.out.println("------");
    }

    public static void swimData(Animal[] animals, int[] distance) {
        for(int i = 0; i < animals.length; i++) {
            animals[i].swim(distance[i]);
        }
        System.out.println("------");
    }

}
