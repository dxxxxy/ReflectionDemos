package studio.dreamys;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import studio.dreamys.obj.d2.Route;

import java.lang.reflect.Method;
import java.util.Set;

public class D2Experience {
    public static void main(String[] args) {
        //scan all methods in package studio
        Reflections reflections = new Reflections("studio", new MethodAnnotationsScanner());

        //get all methods annotated with @Route
        Set<Method> routeMethods = reflections.getMethodsAnnotatedWith(Route.class);

        for (Method routeMethod : routeMethods) {
            //get annotation of method
            Route route = routeMethod.getAnnotation(Route.class);

            //print values
            System.out.println("Method: " + routeMethod.getName() + " | Route Value: " + route.value() + " | Route Method: " + route.method());

            //execute method
            try {
                routeMethod.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
