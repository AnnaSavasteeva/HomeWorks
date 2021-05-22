package Java_1.lesson6;

import java.util.Objects;


public abstract class Animal {
    private final String name;
    protected final int run_limit;
    protected final int swim_limit;
    protected final String unit = "м";
    private static int animalsCounter;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.run_limit = runLimit;
        this.swim_limit = swimLimit;
        animalsCounter++;
    }


    public void swim(int length) {
        String string = this.name + " проплыл ";

        if (length <= this.swim_limit && length > 0) {
            string += length + this.unit + ".";
        } else if (length == 0) {
            string = this.name + " не захотел плыть.";
        } else {
            string = this.name + " мухлюет в плавании: такой дистанции не может быть.";
        }

        System.out.println(string);
    }


    public void run(int length) {
        String string = this.name + " пробежал ";

        if (length <= this.run_limit && length > 0) {
            string += length + this.unit + ".";
        } else if (length == 0) {
            string = this.name + " не захотел бежать.";
        } else {
            string = this.name + " мухлюет в беге: такой дистанции не может быть.";
        }

        System.out.println(string);
    }


    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                ", run_limit=" + run_limit +
                ", swim_limit=" + swim_limit +
                ", unit='" + unit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return run_limit == animal.run_limit && swim_limit == animal.swim_limit && Objects.equals(name, animal.name) && Objects.equals(unit, animal.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, run_limit, swim_limit, unit);
    }

}
