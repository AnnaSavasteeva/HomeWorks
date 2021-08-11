package Java_3.j3_lesson1.task_3;

public class FruitBoxesApp {

    public static void execute() {

        Box<Apple> appleBox1 = new Box<>(fillWithApples(40));
        Box<Apple> appleBox2 = new Box<>(fillWithApples(40));
        Box<Apple> appleBox3 = new Box<>();
        Box<Apple> appleBox4 = new Box<>();
        Box<Orange> orangeBox = new Box<>(fillWithOranges(33));


        System.out.println("--- Вес коробок ---");
        System.out.printf("Вес коробки с яблоками № 1: %f\n", appleBox1.getBoxWeight());
        System.out.printf("Вес коробки с яблоками № 2: %f\n", appleBox1.getBoxWeight());
        System.out.printf("Вес коробки с апельсинами: %f\n", orangeBox.getBoxWeight());

        System.out.print(System.lineSeparator());

        System.out.println("--- Сравнение веса ---");
        System.out.printf("Равен ли вес коробок с яблоками? %b\n", appleBox1.compare(appleBox2));
        System.out.printf("Равен ли вес коробок с яблоками и апельсинами? %b\n", appleBox1.compare(orangeBox));

        System.out.print(System.lineSeparator());

        System.out.println("--- Пересыпаем фрукты ---");
        System.out.printf("В коробке с яблоками №2 - %d яблок\n", appleBox2.getFruitsAmount());
        System.out.printf("В коробке с яблоками №3 - %d яблок\n", appleBox3.getFruitsAmount());
        System.out.println("Пересыпаем яблоки из коробки № 2 в коробку № 3");
        appleBox2.processMovingFruits(appleBox3);
        System.out.printf("В коробке с яблоками №2 - %d яблок\n", appleBox2.getFruitsAmount());
        System.out.printf("В коробке с яблоками №3 - %d яблок\n", appleBox3.getFruitsAmount());
        System.out.println("---------");
        appleBox1.processMovingFruits(appleBox3);
        appleBox2.processMovingFruits(appleBox4);

    }


    private static Apple[] fillWithApples(int fruitsAmount) {
        Apple[] apples = new Apple[fruitsAmount];
        for (int i = 0; i < fruitsAmount; i++) {
            apples[i] = new Apple();
        }
        return apples;
    }


    private static Orange[] fillWithOranges(int fruitsAmount) {
        Orange[] oranges = new Orange[fruitsAmount];
        for (int i = 0; i < fruitsAmount; i++) {
            oranges[i] = new Orange();
        }
        return oranges;
    }


}
