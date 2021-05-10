package lesson7;


public class Cat extends Animal {

    public Cat(String name, int appetite) {
        super(name, appetite);
    }


    @Override
    public void checkEatProcess(Plate p) {
        String message = this.name + " не голоден.";

        if (this.isWellFed) {
            System.out.println(message);
            return;
        }

        if (!p.isFoodInPlate()) {
            System.out.println("В тарелке не осталось еды. " + this.name + " остался голодным.");
            return;
        }


        if (isAppetiteBig(p)){
            int food = p.getFoodAmount();
            eat(p, food);
            decreaseAppetite(food);
            message = this.name + " доел все, что было в тарелке, но остался голодным.";
        } else if (p.isFoodInPlateEnough(this.appetite)) {
            eat(p, this.appetite);
            decreaseAppetite(this.appetite);
            this.isWellFed = true;
            message = this.name + " наелся.";
        }
        System.out.println(message);

    }


    @Override
    protected void eat(Plate p, int foodEaten) {
        p.decreaseFood(foodEaten);
    }


    private void decreaseAppetite(int foodEaten) {
        this.appetite -= foodEaten;
    }


    private boolean isAppetiteBig(Plate p) {
        return this.appetite > p.getFoodAmount();
    }


    public String getHungerInfo() {
        String str = this.name;
        str += (this.isWellFed)
                ? " - сыт и доволен :)"
                : " все еще голоден при аппетите " + this.appetite + " :(";
        return str;
    }

}
