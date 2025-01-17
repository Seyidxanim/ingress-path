package lesson_9;

import lesson_3.taskClass.Car;

public class Student  implements  Comparable<Student> {
    Integer age;
    String  name;
    // compareble age gore comperator alfi name  comperator name lenght



    public  Student(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public Student() {

    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
