package Java_3.j3_lesson5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private final Semaphore semaphore;

    public Tunnel (int carsAmount) {
        this.length = 80;
        this.description = "тоннель " + length + " метров";
//    В тоннель не может одновременно заехать больше половины участников
        this.semaphore = new Semaphore(carsAmount / 2);
    }

    @Override
    public void go(Car car) {

        try {
            try {
                System.out.println(car.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
                System.out.println(car.getName() + " начал этап: " + description);
                Thread.sleep(length / car.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(car.getName() + " закончил этап: " + description);
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
