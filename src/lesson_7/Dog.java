package lesson_7;

public class Dog implements Runnable {

    @Override
    public void run(String message) {
        System.out.println("Dog: " + message);
    }
}
