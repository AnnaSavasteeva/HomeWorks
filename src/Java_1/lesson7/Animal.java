package Java_1.lesson7;

import java.util.Objects;


public abstract class Animal {

    protected final String name;
    protected int appetite;
    protected boolean isWellFed;

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public abstract void checkEatProcess(Plate p);
    protected abstract void eat(Plate p, int foodEaten);
    public abstract String getHungerInfo();


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isWellFed=" + isWellFed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return appetite == animal.appetite && isWellFed == animal.isWellFed && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appetite, isWellFed);
    }

}
