package lesson6;

import java.util.Objects;

public class Cat extends Animal {
    public static final int RUN_LIMIT = 200;
    private static int catsCounter;

    public Cat(String name) {
        super(name);
        super.runLimit = RUN_LIMIT;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return RUN_LIMIT == cat.RUN_LIMIT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), RUN_LIMIT);
    }

}
