package Java_1.lesson7;


import java.util.Objects;

public class Plate {
    private int foodAmount;
    private final int foodLimit;

    public Plate(int food) {
        this.foodAmount = food;
        this.foodLimit = food;
    }


    public void decreaseFood (int foodEaten) {
        foodAmount -= foodEaten;
    }


    public void fillPlate(int foodAddition) {
        if (foodAddition > 0) {
            if ((this.foodAmount + foodAddition) > this.foodLimit) {
                this.foodAmount = this.foodLimit;
                System.out.println("Еды было больше, чем нужно. Лишнюю не взяли.");
            } else {
                this.foodAmount += foodAddition;
            }
        } else if (foodAddition == 0) {
            System.out.println("Вы не добавили еды.");
        } else {
            System.out.println("Еду нельзя убавлять.");
        }
    }


    public int getFoodShortage() {
        return (this.foodLimit - this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean isFoodInPlate() {
        return this.foodAmount > 0;
    }

    public boolean isFoodInPlateEnough(int needFood) {
        return this.foodAmount >= needFood;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + foodAmount);
    }


    @Override
    public String toString() {
        return "Plate{" +
                "foodAmount=" + foodAmount +
                ", foodLimit=" + foodLimit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return foodAmount == plate.foodAmount && foodLimit == plate.foodLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodAmount, foodLimit);
    }

}
