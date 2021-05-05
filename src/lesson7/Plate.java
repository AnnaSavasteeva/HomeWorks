package lesson7;

import java.util.Objects;


public class Plate {
    private int foodAmount;
    private boolean isPlateFull;

    public Plate(int food) {
        this.foodAmount = food;
        isPlateFull = true;
    }


    public void decreaseFood (int n) {
        foodAmount -= n;
        isPlateFull = false;
    }


    public void fillPlate(int foodAddition, int foodLimit) {
        if (!isPlateFull) {
            int finalFoodAmount = this.foodAmount + foodAddition;

            if (finalFoodAmount > foodLimit) {
                this.foodAmount = foodLimit;
                System.out.println("Еды было больше, чем нужно. Лишнюю не взяли.");
                isPlateFull = true;
            } else if (foodAddition > 0) {
                this.foodAmount += foodAddition;
                isPlateFull = (finalFoodAmount == foodLimit);
            } else {
                System.out.println("Руки прочь от кошачьей еды!");
            }
        } else {
            System.out.println("Тарелка полная!");
        }
    }


    public int getFoodShortage(int foodLimit) {
        return (foodLimit - this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + foodAmount);
    }


    @Override
    public String toString() {
        return "Plate{" +
                "foodAmount=" + foodAmount +
                ", isPlateFull=" + isPlateFull +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return foodAmount == plate.foodAmount && isPlateFull == plate.isPlateFull;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodAmount, isPlateFull);
    }

}
