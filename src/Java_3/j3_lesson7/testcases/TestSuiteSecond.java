package Java_3.j3_lesson7.testcases;


import Java_3.j3_lesson7.annotations.BeforeSuite;
import Java_3.j3_lesson7.annotations.Test;

public class TestSuiteSecond extends TestCases {
    private int counter;


    @BeforeSuite
    public void initActions() {
        this.printClassInfo();
        this.printCounter();
    }



    @Test(priority = 10)
    public void incrementCounterToThirty() {
        this.counter = 30;
        this.printCounter();
    }

    @Test(priority = 9)
    public void incrementCounterToTwenty() {
        this.counter = 20;
        this.printCounter();
    }

    @Test(priority = 8)
    public void incrementCounterToTen() {
        this.counter = 10;
        this.printCounter();
    }



    private void printCounter() {
        System.out.printf("Counter: %d\n", this.counter);
    }

}
