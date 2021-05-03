package lesson6;

import java.util.Objects;

public class Dog extends Animal {
    private final int RUN_LIMIT = 500;
    private final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);
        super.RUN_LIMIT = this.RUN_LIMIT;
    }


    @Override
    public void swim(int length) {
        String string = this.getName() + " проплыл ";

        if (length <= this.SWIM_LIMIT && length > 0) {
            string += length + this.UNIT + ".";
        } else if (length == 0) {
            string = this.getName() + " не стал плавать, а пошел есть.";
        } else {
            string = this.getName() + " мухлюет в плавании, это недопустимая дистанция.";
        }

        System.out.println(string);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", UNIT='" + UNIT + '\'' +
                ", RUN_LIMIT=" + RUN_LIMIT +
                ", SWIM_LIMIT=" + SWIM_LIMIT +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return RUN_LIMIT == dog.RUN_LIMIT && SWIM_LIMIT == dog.SWIM_LIMIT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), RUN_LIMIT, SWIM_LIMIT);
    }

}
