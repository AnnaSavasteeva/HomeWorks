package lesson6;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    protected int runLimit;
    protected int swimLimit;
    protected final String UNIT = "м";
    private static int animalsCounter;

    public Animal(String name) {
        this.name = name;
        animalsCounter++;
    }


    public abstract void swim(int length);

//    Нет смысла делать этот метод абстрактным, т.к. его реализация - одинакова для всех классов-потомков
    public void run(int length) {
        String string = this.name + " пробежал ";

        if (length <= this.runLimit && length > 0) {
            string += length + this.UNIT + ".";
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
                ", runLimit=" + runLimit +
                ", swimLimit=" + swimLimit +
                ", UNIT='" + UNIT + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return runLimit == animal.runLimit && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runLimit);
    }

}
