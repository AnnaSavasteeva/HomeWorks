package Java_2.j2_lesson1;

import java.util.Random;


public class Wall implements Obstacles {
    private final String name;
    private final int height;
    Random rand = new Random();

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }


    @Override
    public void overcomeObstacle(Activities jumper) {
        if (jumper.getIsDroppedOut()) {
            System.out.println(jumper.getName() + " выбыл");
            return;
        }

        int jumpHeight = rand.nextInt(jumper.getJumpHeightMax()) + 1;
        if (this.height >= jumper.getJumpHeightMax() || this.height >= jumpHeight) {
            System.out.println(jumper.getName() + " не смог перепрыгнуть через стену");
            jumper.setDroppedOut(true);
            return;
        }

        jumper.jump(jumper.getName(), jumpHeight);
    }


    @Override
    public String getObstacleInfo() {
        return (this.name + ", высота (см): " + this.height);
    }

}
