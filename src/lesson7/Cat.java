package lesson7;


public class Cat extends Animal {

    public Cat(String name, int appetite) {
        super(name, appetite);
    }


    @Override
    public void checkEatProcess(Plate p) {
        String message = this.NAME + " не голоден.";

        if (!this.isWellFed) {
            if (p.isFoodInPlate()) {
                if (isAppetiteBig(p)){
                    int food = p.getFoodAmount();
                    eat(p, food);
                    decreaseAppetite(food);
                    message = this.NAME + " доел все, что было в тарелке, но остался голодным.";
                } else if (p.isFoodInPlateEnough(this.appetite)) {
                    eat(p, this.appetite);
                    decreaseAppetite(this.appetite);
                    this.isWellFed = true;
                    message = this.NAME + " наелся.";
                }
            } else {
                message = "В тарелке не осталось еды. " + this.NAME + " остался голодным.";
            }
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
        String str = this.NAME;
        str += (this.isWellFed)
                ? " - сыт и доволен :)"
                : " все еще голоден при аппетите " + this.appetite + " :(";
        return str;
    }

}
