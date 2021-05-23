package Java_2.j2_lesson1;

import java.util.Random;


public class RunningTrack implements Obstacles {
    private final String name;
    private final int length;
    Random rand = new Random();

    public RunningTrack(String name, int length) {
        this.name = name;
        this.length = length;
    }


    @Override
    public void overcomeObstacle(Activities runner) {
        if (runner.getIsDroppedOut()) {
            System.out.println(runner.getName() + " выбыл");
            return;
        }

        int runLength = rand.nextInt(runner.getRunLengthMax()) + 1;
        if (this.length >= runner.getRunLengthMax() || this.length >= runLength) {
            System.out.println(runner.getName() + " не смог пробежать дистанцию");
            runner.setDroppedOut(true);
            return;
        }

        runner.run(runner.getName(), runLength);
    }


    @Override
    public String getObstacleInfo() {
        return (this.name + ", длина (м): " + this.length);
    }

}
