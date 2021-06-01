package Java_2.j2_lesson2;


public class MyArraySizeException extends Exception {
    private final int arrSize;
    private int innerArr = -1;
    private int innerArrSize = -1;

    MyArraySizeException(int arrSize) {
        super("Invalid array size");
        this.arrSize = arrSize;
    }

    MyArraySizeException(int arrSize, int innerArr, int innerArrSize) {
        this(arrSize);
        this.innerArr = innerArr;
        this.innerArrSize = innerArrSize;
    }

    @Override
    public String getMessage() {
        String arrNumber = (this.innerArr >= 0) ? "[" + this.innerArr + "]" : "";
        int arrSize = (this.innerArrSize >= 0) ? this.innerArrSize : this.arrSize;
        return this.getClass().getSimpleName() + "[Array" + arrNumber + " size: " + arrSize + "]";
    }

}
