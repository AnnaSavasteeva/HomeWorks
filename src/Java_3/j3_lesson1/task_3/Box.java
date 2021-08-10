package Java_3.j3_lesson1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box <E extends Fruit> {

    private final ArrayList<E> fruitBox;


    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public Box(E... fruits) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box(ArrayList<E> fruits) {
        this.fruitBox = new ArrayList<>();
        this.fruitBox.addAll(fruits);
    }


    public void addFruit(E fruit) {
        this.fruitBox.add(fruit);
    }


    public float getBoxWeight() {
        if (fruitBox.size() == 0) {
            return 0.0f;
        }
//        Неизвестно,весят ли все яблоки одинаково, поэтому складываем вес каждого,
//        а не умножаем количество яблок на один стандартный вес
        float weight = 0.0f;
        for (E fruit : fruitBox) {
            weight += fruit.getFruitWeight();
        }
        return weight;
    }


    public int getFruitsAmount() {
        return this.fruitBox.size();
    }


    public Boolean compare(Box<?> box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }


    public void processMovingFruits(Box<E> box) {
        if(isBoxEmpty(this)) {
            System.out.println("Невозможно пересыпать фрукты: коробка пуста");
            return;
        }

        if (!isBoxEmpty(box)) {
            System.out.println("Невозможно пересыпать фрукты: вторая коробка занята");
            return;
        }

        if (moveFruits(box)) {
            this.fruitBox.clear();
        } else {
            System.out.println("Не удалось пересыпать фрукты...");
        }
    }


    private boolean isBoxEmpty(Box<?> box) {
        return box.fruitBox.size() < 1;
    }

    private boolean moveFruits(Box<E> box) {
        return box.getFruitBox().addAll(0, this.fruitBox);
    }

    private ArrayList<E> getFruitBox() {
        return fruitBox;
    }


    @Override
    public String toString() {
        return "Box{" +
                "fruitBox=" + fruitBox +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(fruitBox, box.fruitBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruitBox);
    }

}
