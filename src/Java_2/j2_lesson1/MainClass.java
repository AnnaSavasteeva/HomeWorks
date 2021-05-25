package Java_2.j2_lesson1;

import java.util.Random;


public class MainClass {

    public static void main(String[] args) {
        Random rand = new Random();

        Activities[] participants = {
                new Human("Человек", (rand.nextInt(500) + 100), (rand.nextInt(120) + 50)),
                new Cat("Кот", (rand.nextInt(150) + 50), (rand.nextInt(250) + 100)),
                new Robot("Робот", (rand.nextInt(1000) + 300), (rand.nextInt(300) + 100))
        };

        Obstacles[] obstacles = {
            new RunningTrack("Беговая дорожка", (rand.nextInt(500))),
            new Wall("Стена", (rand.nextInt(150)))
        };


        ObstacleCourse.passObstacleCourse(obstacles, participants);

    }

}
