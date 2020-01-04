package ClassWorkAnnotation;

import api.Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;

public class TestAnnotation {
    public static void main(String[] args) {

        Method[] methods = Calculator.class.getMethods();
        for(Method method : methods){
            IVersion annotation = method.getAnnotation(IVersion.class);
            System.out.println(annotation.info());
        }
    }
}
