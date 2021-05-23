package Java_2.j2_lesson1;


public interface Activities {
    String METER = "м";
    String CENTIMETER = "см";


    default void run(String name, int distance) {
        System.out.println(name + " пробежал " + distance + Activities.METER);
    }

    default void jump(String name, int height) {
        System.out.println(name + " подпрыгнул на " + height + Activities.CENTIMETER);
    }


    String getName();
    int getRunLengthMax();
    int getJumpHeightMax();

    boolean getIsDroppedOut();
    void setDroppedOut(boolean droppedOut);

}
