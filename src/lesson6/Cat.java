package lesson6;

import java.util.Objects;

public class Cat extends Animal {
    private final int RUN_LIMIT = 200;

    public Cat(String name) {
        super(name);
        super.RUN_LIMIT = this.RUN_LIMIT;
    }


    @Override
    public void swim(int length) {
        System.out.println(this.getName() + " не будет плыть " + length + this.UNIT + ", т.к. коты не любят плавать.");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", UNIT='" + UNIT + '\'' +
                ", RUN_LIMIT=" + RUN_LIMIT +
                '}';
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
