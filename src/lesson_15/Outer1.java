package lesson_15;

import java.util.logging.Logger;

public class Outer1 {
    String name;


    public void print() {
        class Local {
            public void test1(String name) {
                System.out.println("Hello");
            }
        }
        Local local=new Local();
        local.test1("Name");
    }
}
