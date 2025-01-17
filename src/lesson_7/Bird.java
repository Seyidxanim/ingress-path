package lesson_7;

public class Bird implements Flyable,Runnable{
    @Override
    public void run(String message) {
        System.out.println("Bird: " + message);
    }

    @Override
    public void fly(String obj) {
        System.out.println("Bird: " + obj);
    }
}
