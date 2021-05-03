package lesson6;

import static lesson6.ObjArrays.runSwim;


public class AnimalsApp {

    public static void main(String[] args) {
        String[][] catsArr = {
                {"Мурзик", "125", "3"},
                {"Барсик", "300", "2"},
                {"Пират", "0", "1"}
        };

        String[][] dogsArr = {
                {"Мухтар", "442", "10"},
                {"Бобик", "0", "0"},
                {"Шарик", "-5", "15"}
        };


        Animal[] cats = new Animal[catsArr.length];
        ObjArrays.createCatsObjArr(catsArr, cats);

        Animal[] dogs = new Animal[dogsArr.length];
        ObjArrays.createDogsObjArr(dogsArr, dogs);


        runSwim(cats, catsArr);
        runSwim(dogs, dogsArr);


        System.out.println(Animal.getAnimalsAmount());


//        Animal[] cats = ObjArrays.createObjArr(catsArr, "Cat");
//        Animal[] dogs = ObjArrays.createObjArr(dogsArr, "Dog");

    }

}
