package studio.dreamys;

import studio.dreamys.obj.d3.VeryPrivate;

import java.lang.reflect.Field;

public class D3Access {
    public static void main(String[] args) {
        //get very private class
        VeryPrivate veryPrivate = new VeryPrivate();

        //find field and change value
        try {
            Field field = veryPrivate.getClass().getDeclaredField("str");
            field.setAccessible(true);
            field.set(veryPrivate, "Hello, Reflection!");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //print new value
        try {
            Field field = veryPrivate.getClass().getDeclaredField("str");
            field.setAccessible(true);
            System.out.println(field.get(veryPrivate));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
