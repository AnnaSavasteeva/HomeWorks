package Java_3.j3_lesson7.testcases;


import Java_3.j3_lesson7.annotations.AfterSuite;
import Java_3.j3_lesson7.annotations.BeforeSuite;
import Java_3.j3_lesson7.annotations.Test;

public class TestSuiteFirst extends TestCases {
    private int counter;


    @BeforeSuite
    public void initActions() {
        this.printClassInfo();
        this.printCounter();
    }

    @AfterSuite
    public void finalActions() {
        System.out.print("FINAL. ");
        this.printCounter();
        TestCases.printSeparators();
    }



    @Test(priority = 5)
    public void incrementCounterToFive() {
        this.counter = 5;
        this.printCounter();
    }

    @Test(priority = 9)
    public void incrementCounterToNine() {
        this.counter = 9;
        this.printCounter();
    }

    @Test
    public void incrementCounterToOne() {
        this.counter = 1;
        this.printCounter();
    }

    @Test(priority = 3)
    public void incrementCounterToThree() {
        this.counter = 3;
        this.printCounter();
    }

    @Test(priority = 7)
    public void incrementCounterToSeven() {
        this.counter = 7;
        this.printCounter();
    }



    private void printCounter() {
        System.out.printf("Counter: %d\n", this.counter);
    }


}
