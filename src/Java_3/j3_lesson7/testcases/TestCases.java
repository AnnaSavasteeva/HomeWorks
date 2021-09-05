package Java_3.j3_lesson7.testcases;

public abstract class TestCases {
    private final String className = this.getClass().getSimpleName();

    protected void printClassInfo() {
        System.out.println("Class: " + this.className);
    }

    protected static void printSeparators() {
        System.out.println("---------");
    }
}
