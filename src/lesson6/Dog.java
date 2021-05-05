package lesson6;


public class Dog extends Animal {
    public static final int RUN_LIMIT = 500;
    public static final int SWIM_LIMIT = 10;
    private static int dogsCounter;

    public Dog(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        dogsCounter++;
    }

    public static String getDogsAmount() {
        return "Всего собак: " + dogsCounter;
    }

}
