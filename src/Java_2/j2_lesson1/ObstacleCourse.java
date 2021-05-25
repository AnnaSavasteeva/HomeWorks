package Java_2.j2_lesson1;


public class ObstacleCourse {

    public static void passObstacleCourse(Obstacles[] obstacles, Activities[] participants) {
        for (Obstacles obstacle: obstacles) {
            System.out.println(obstacle.getObstacleInfo());

            for (Activities participant: participants) {
                obstacle.overcomeObstacle(participant);
            }

            System.out.println();
        }
    }

}
