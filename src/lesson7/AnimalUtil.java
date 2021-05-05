package lesson7;


public class AnimalUtil {

    public static void processFeeding(Animal[] animals, Plate plate, int foodLimit) {
        System.out.println("--- Обедать! ---");
        plate.info();
        AnimalUtil.feedAnimals(animals, plate);
        plate.info();

        System.out.println("--- Что тут у нас с сытостью... ---");
        AnimalUtil.printAnimalsInfo(animals);

        System.out.println("--- Добавки? ---");
        plate.fillPlate(plate.getFoodShortage(foodLimit), foodLimit);
        plate.info();

        System.out.println("--- Кто там оставался голодным? ---");
        AnimalUtil.feedAnimals(animals, plate);
        AnimalUtil.printAnimalsInfo(animals);
    }


    public static void feedAnimals(Animal[] animals, Plate plate) {
        for(Animal animal: animals) {
            animal.eat(plate);
        }
    }


    public static void printAnimalsInfo(Animal[] animals) {
        for(Animal animal: animals) {
            System.out.println(animal.getHungerInfo());
        }
    }

}
