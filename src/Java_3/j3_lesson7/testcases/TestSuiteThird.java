package Java_3.j3_lesson7.testcases;


import Java_3.j3_lesson7.annotations.AfterSuite;
import Java_3.j3_lesson7.annotations.Test;

public class TestSuiteThird extends TestCases {
    private int counter;


    @AfterSuite
    public void finalActions() {
        System.out.print("FINAL. ");
        this.printCounter();
        TestCases.printSeparators();
    }



    @Test
    public void incrementCounterToOneH() {
        this.counter = 100;
        this.printCounter();
    }

    @Test
    public void incrementCounterToTwoH() {
        this.counter = 200;
        this.printCounter();
    }

    @Test
    public void incrementCounterToThreeH() {
        this.counter = 300;
        this.printCounter();
    }



    private void printCounter() {
        System.out.printf("Counter: %d\n", this.counter);
    }

}
