package lesson7;


public class Cat extends Animal {

    public Cat(String name, int appetite) {
        super(name, appetite);
    }


    @Override
    public void eat(Plate p) {
        if (!this.isWellFed) {
            if (this.appetite > p.getFoodAmount()){
                int food = p.getFoodAmount();
                this.appetite -= food;
                p.decreaseFood(food);
            } else if (this.appetite > 0) {
                p.decreaseFood(this.appetite);
                this.appetite = 0;
                this.isWellFed = true;
            } else {
                this.isWellFed = true;
            }
        }
    }


    public String getHungerInfo() {
        String str = this.NAME;
        str += (this.isWellFed)
                ? " - сыт и доволен :)"
                : " остается голодным с аппетитом " + this.appetite + " :(";
        return str;
    }

}
