package Java_3.j3_lesson1.task_3;

import java.util.Objects;

public abstract class Fruit {

    private final float fruitWeight;

    public Fruit(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public float getFruitWeight() {
        return this.fruitWeight;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "fruitWeight=" + fruitWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(fruitWeight, fruit.fruitWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruitWeight);
    }

}
