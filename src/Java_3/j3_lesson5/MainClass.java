package Java_3.j3_lesson5;

import java.util.concurrent.*;

public class MainClass {
    private static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(CARS_COUNT);
        CountDownLatch cdlStart = new CountDownLatch(CARS_COUNT);
        CountDownLatch cdlFinish = new CountDownLatch(CARS_COUNT); // Для окончания гонок и объявления победителя
        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT); // Для одновременного старта участников

        Race race = new Race(new Road(60), new Tunnel(CARS_COUNT), new Road(40));

        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            int speed = 20 + (int) (Math.random() * 10);
            cars[i] = new Car(race, speed, cdlStart, cdlFinish, cb);
        }


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        for (Car car : cars) {
            executor.execute(car);
        }

        try {
            cdlStart.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            cdlFinish.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

            String winner = null;
            for (Car car : cars) {
                String carName = car.getName();
                int place= car.getPlaceFinished();
                System.out.printf("%s: %d место%n", carName, place);

                if (place == 1) {
                    winner = carName;
                }
            }

            if (winner != null) {
                System.out.println("ПОБЕДИТЕЛЬ >>> " + winner);
            } else {
                System.out.println("СБОЙ В НАБЛЮДЕНИИ ЗА ГОНКАМИ!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }

}
