package studio.dreamys.obj.d2;

public class HelloWorld {

    @Route("/hello-world")
    public static void getHelloWorld() {
        System.out.println("Hello World");
    }
}
