package Java_3.j3_lesson7;



import Java_3.j3_lesson7.annotations.AfterSuite;
import Java_3.j3_lesson7.annotations.BeforeSuite;
import Java_3.j3_lesson7.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;

public class TestSuitesRunner {

    public static void start(Class<?> testClass) {
        ArrayList<Method> beforeSuiteMethods = getMethodsAnnotatedWith(testClass, BeforeSuite.class);
        ArrayList<Method> afterSuiteMethods = getMethodsAnnotatedWith(testClass, AfterSuite.class);
        ArrayList<Method> testMethods = getMethodsAnnotatedWith(testClass, Test.class);
        Object instance = createNewInstance(testClass);

        if (!isMethodAmountValid(beforeSuiteMethods) || !isMethodAmountValid(afterSuiteMethods)) {
            throw new RuntimeException("There are too much methods");
        }

        if (getMethodsAmount(beforeSuiteMethods) != 0) {
            runMethods(beforeSuiteMethods, instance);
        }

        runMethods(testMethods, instance);

        if (getMethodsAmount(afterSuiteMethods) != 0) {
            runMethods(afterSuiteMethods, instance);
        }

        System.out.println("Test run for " + testClass.getSimpleName() + " completed");
        System.out.println();
        System.out.println();

    }


    private static ArrayList<Method> getMethodsAnnotatedWith(Class<?> clazz, Class<? extends Annotation> annotation) {
        Method[] allClassMethods = clazz.getDeclaredMethods();
        ArrayList<Method> methods = new ArrayList<>();

        for (Method classMethod : allClassMethods) {
            if (classMethod.getAnnotation(annotation) != null) {
                methods.add(classMethod);
            }
        }

        methods.sort(Comparator.comparingInt(method -> method.getAnnotation(Test.class).priority()));

        return methods;
    }

    private static int getMethodsAmount(ArrayList<Method> methods) {
        return methods.size();
    }

    private static boolean isMethodAmountValid(ArrayList<Method> methods) {
        return (methods.size() == 1) || (methods.size() == 0);
    }

    private static void runMethods(ArrayList<Method> methods, Object instance) {
        for (Method method : methods) {
            makeMethodPublic(method);

            try {
                method.invoke(instance);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    private static void makeMethodPublic(Method method) {
        if (Modifier.isPublic(method.getModifiers())) {
            method.setAccessible(true);
        }
    }

    private static Object createNewInstance(Class<?> clazz) {
        Object instance = null;

        try {
            instance = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }

}
