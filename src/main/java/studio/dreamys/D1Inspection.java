package studio.dreamys;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class D1Inspection {
    public static void main(String[] args) throws ClassNotFoundException {
        //safe
        Class<?> clazz = String.class;

        //unsafe (not currently present)
//      Class<?> clazz = Class.forName("java.lang.String");

        //print class fields
        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.toString());
        }

        //print class methods
        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }

        //print class constructors
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }
    }
}