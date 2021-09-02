package Java_3.j3_lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int carsNameCount;
    private static int carsFinishedCount;

    private final Race race;
    private final int speed;
    private final String name;
    private int placeFinished;

    private final CountDownLatch cdlStart;
    private final CountDownLatch cdlFinish;
    private final CyclicBarrier cb;


    public Car(Race race, int speed, CountDownLatch cdlStart, CountDownLatch cdlFinish, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        carsNameCount++;
        this.name = "Участник # " + carsNameCount;
        this.cdlStart = cdlStart;
        this.cdlFinish = cdlFinish;
        this.cb = cb;
    }


    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cdlStart.countDown();
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        placeFinished = ++carsFinishedCount;
        if (carsFinishedCount == 1) {
            System.out.println("ПОБЕДИТЕЛЬ >>> " + this.name);
        }

        this.cdlFinish.countDown();
    }


    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getPlaceFinished() {
        return placeFinished;
    }

}
