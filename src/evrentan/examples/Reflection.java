package evrentan.examples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        PrintHello reflectionClassWithoutReflection = new PrintHello();
        reflectionClassWithoutReflection.setValue("Hello Java without Reflection !!!");
        System.out.println(reflectionClassWithoutReflection.getValue());

        Object reflectionClassWithReflection = PrintHello.class.getDeclaredConstructor().newInstance();
        Method setValue = reflectionClassWithReflection.getClass().getDeclaredMethod("setValue", String.class);
        setValue.invoke(reflectionClassWithReflection, "Hello Java with Reflection !!!");
        Method method = reflectionClassWithReflection.getClass().getDeclaredMethod("printHello");
        method.setAccessible(true);
        method.invoke(reflectionClassWithReflection);
    }
}
