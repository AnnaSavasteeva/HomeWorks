package lesson6;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    protected int RUN_LIMIT;
    protected final String UNIT = "м";
    private static int animalsCounter = 0;

    public Animal(String name) {
        this.name = name;
        animalsCounter++;
    }


    public abstract void swim(int length);

//    Нет смысла делать этот метод абстрактным, т.к. его реализация - одинакова для всех классов-потомков
    public void run(int length) {
        String string = this.name + " пробежал ";

        if (length <= this.RUN_LIMIT && length > 0) {
            string += length + this.UNIT + ".";
        } else if (length == 0) {
            string = this.name + " не стал бегать, а лег спать.";
        } else {
            string = this.name + " мухлюет в беге, это недопустимая дистанция.";
        }

        System.out.println(string);
    }


    public String getName() {
        return name;
    }

    public static String getAnimalsAmount() {
        return "Всего животных: " + animalsCounter;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "animalsCounter=" + animalsCounter +
                ", name='" + name + '\'' +
                ", UNIT='" + UNIT + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return RUN_LIMIT == animal.RUN_LIMIT && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, RUN_LIMIT);
    }

}
