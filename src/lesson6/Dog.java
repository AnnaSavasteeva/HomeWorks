package lesson6;

import java.util.Objects;

public class Dog extends Animal {
    public static final int RUN_LIMIT = 500;
    public static final int SWIM_LIMIT = 10;
    private static int dogsCounter;

    public Dog(String name) {
        super(name);
        super.runLimit = RUN_LIMIT;
        super.swimLimit = SWIM_LIMIT;
        dogsCounter++;
    }


    @Override
    public void swim(int length) {
        String string = this.getName() + " проплыл ";

        if (length <= SWIM_LIMIT && length > 0) {
            string += length + this.UNIT + ".";
        } else if (length == 0) {
            string = this.getName() + " не захотел плыть.";
        } else {
            string = this.getName() + " мухлюет в плавании: такой дистанции не может быть.";
        }

        System.out.println(string);
    }

    public static String getDogsAmount() {
        return "Всего собак: " + dogsCounter;
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
