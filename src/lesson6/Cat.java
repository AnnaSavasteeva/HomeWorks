package lesson6;


public class Cat extends Animal {
    public static final int RUN_LIMIT = 200;
    private static int catsCounter;

    public Cat(String name) {
        super(name, RUN_LIMIT, 0);
        catsCounter++;
    }


    @Override
    public void swim(int length) {
        String str;
        if (length > 0) {
            str = this.getName() + " не будет плыть " + length + this.UNIT + ", т.к. коты не любят плавать.";
        } else {
            str = "Коты не любят плавать. Кроме того, такой дистанции не может быть!";
        }

        System.out.println(str);
    }


    public static String getCatsAmount() {
        return "Всего котов: " + catsCounter;
    }

}
