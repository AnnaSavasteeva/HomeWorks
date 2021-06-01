package Java_2.j2_lesson2;


public class MyArrayDataException extends Exception {
    private final int arrIndex;
    private final int innerArrIndex;
    String notIntData;

    public MyArrayDataException(int arrIndex, int innerArrIndex, String notIntData) {
        super("Invalid data format");
        this.arrIndex = arrIndex;
        this.innerArrIndex = innerArrIndex;
        this.notIntData = notIntData;
    }

    @Override
    public String getMessage() {
        return this.getClass().getSimpleName() + "[non-numeric format in a cell(" +
                this.arrIndex + ", " + this.innerArrIndex + "): " + this.notIntData + "]";
    }

}
