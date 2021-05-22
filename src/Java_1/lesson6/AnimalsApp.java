package Java_1.lesson6;

import java.util.Random;


public class AnimalsApp {

    public static void main(String[] args) {
        Random rand = new Random();

        String[] catsArr = {"Мурзик", "Барсик", "Пират"};
        String[] dogsArr = {"Мухтар", "Бобик", "Шарик", };


        Animal[] cats = new Animal[catsArr.length];
        ObjArrays.createCatsObjArr(catsArr, cats);

        Animal[] dogs = new Animal[dogsArr.length];
        ObjArrays.createDogsObjArr(dogsArr, dogs);


        int[] catsRunningDistances = {(rand.nextInt(Cat.RUN_LIMIT) + 1), 0, (Cat.RUN_LIMIT + 1)};
        int[] catsSwimmingDistances = {-1, 0, 1};
        int[] dogsRunningDistances = {(rand.nextInt(Dog.RUN_LIMIT) + 1), 0, (Dog.RUN_LIMIT + 1)};
        int[] dogsSwimmingDistances = {(rand.nextInt(Dog.SWIM_LIMIT) + 1), 0, (Dog.SWIM_LIMIT + 1)};


        System.out.println("---Данные по котам---");
        ObjArrays.runData(cats, catsRunningDistances);
        ObjArrays.swimData(cats, catsSwimmingDistances);

        System.out.println("---Данные по собакам---");
        ObjArrays.runData(dogs, dogsRunningDistances);
        ObjArrays.swimData(dogs, dogsSwimmingDistances);

        System.out.println(Animal.getAnimalsAmount());
        System.out.println(Cat.getCatsAmount());
        System.out.println(Dog.getDogsAmount());

    }

}
