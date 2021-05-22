package Java_1.lesson7;

import java.util.Random;


public class CatsFeeding {

    public static void catsFeeding() {
        final int MAX_FOOD_AMOUNT = 100;
        Random rand = new Random();
        Plate plate = new Plate(MAX_FOOD_AMOUNT);
        String[] catNames = {"Мурзик", "Барсик", "Черныш", "Пират", "Рыжик"};
        Animal[] cats = new Cat[catNames.length];

        for(int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(catNames[i], (rand.nextInt(MAX_FOOD_AMOUNT) + 1));
        }

        AnimalUtil.processFeeding(cats, plate);
    }

}
