package lesson_7;

public class Main {
    public static void main(String[] args) {
        Flyable flyable=new Bird();
        flyable.fly("is flying");

        Runnable runnable=new Bird();
        runnable.run("is running");

        Runnable runnable1=new Dog();
        runnable1.run("is running");

    }
}
