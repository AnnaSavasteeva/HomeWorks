package Java_3.j3_lesson7;

import Java_3.j3_lesson7.testcases.TestSuiteFirst;
import Java_3.j3_lesson7.testcases.TestSuiteSecond;
import Java_3.j3_lesson7.testcases.TestSuiteThird;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {
        ArrayList<Class <?>> classes = new ArrayList<>();
        classes.add(TestSuiteFirst.class);
        classes.add(TestSuiteSecond.class);
        classes.add(TestSuiteThird.class);

        for (Class<?> classTest : classes) {
            TestSuitesRunner.start(classTest);
        }
    }

}
