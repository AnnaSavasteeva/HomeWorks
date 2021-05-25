package Java_2.j2_lesson1;


public class Robot implements Activities {
    private final String name;
    private final int runLengthMax;
    private final int jumpHeightMax;
    private boolean isDroppedOut;

    public Robot(String name, int runLengthMax, int jumpHeightMax) {
        this.name = name;
        this.runLengthMax = runLengthMax;
        this.jumpHeightMax = jumpHeightMax;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getRunLengthMax() {
        return this.runLengthMax;
    }

    @Override
    public int getJumpHeightMax() {
        return this.jumpHeightMax;
    }

    @Override
    public boolean getIsDroppedOut() {
        return this.isDroppedOut;
    }

    @Override
    public void setDroppedOut(boolean droppedOut) {
        this.isDroppedOut = droppedOut;
    }

}
