package lesson6;

import java.util.Objects;


public abstract class Animal {
    private final String NAME;
    protected final int RUN_LIMIT;
    protected final int SWIM_LIMIT;
    protected final String UNIT = "м";
    private static int animalsCounter;

    public Animal(String name, int runLimit, int swimLimit) {
        this.NAME = name;
        this.RUN_LIMIT = runLimit;
        this.SWIM_LIMIT = swimLimit;
        animalsCounter++;
    }


    public void swim(int length) {
        String string = this.NAME + " проплыл ";

        if (length <= this.SWIM_LIMIT && length > 0) {
            string += length + this.UNIT + ".";
        } else if (length == 0) {
            string = this.NAME + " не захотел плыть.";
        } else {
            string = this.NAME + " мухлюет в плавании: такой дистанции не может быть.";
        }

        System.out.println(string);
    }


    public void run(int length) {
        String string = this.NAME + " пробежал ";

        if (length <= this.RUN_LIMIT && length > 0) {
            string += length + this.UNIT + ".";
        } else if (length == 0) {
            string = this.NAME + " не захотел бежать.";
        } else {
            string = this.NAME + " мухлюет в беге: такой дистанции не может быть.";
        }

        System.out.println(string);
    }


    public String getName() {
        return NAME;
    }

    public static String getAnimalsAmount() {
        return "Всего животных: " + animalsCounter;
    }

    public void printInfo(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "NAME='" + NAME + '\'' +
                ", RUN_LIMIT=" + RUN_LIMIT +
                ", SWIM_LIMIT=" + SWIM_LIMIT +
                ", UNIT='" + UNIT + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return RUN_LIMIT == animal.RUN_LIMIT && SWIM_LIMIT == animal.SWIM_LIMIT && Objects.equals(NAME, animal.NAME) && Objects.equals(UNIT, animal.UNIT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, RUN_LIMIT, SWIM_LIMIT, UNIT);
    }

}
