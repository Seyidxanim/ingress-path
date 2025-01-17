package lesson_15;

public class Main {
    public static void main(String[] args) {
        Outer1 outer1=new Outer1();
        outer1.print();


        Outer2 outer2=new Outer2();
        Outer2.Inner inner=outer2.new Inner(5);
    }
}
