package lesson_5;

import java.util.UUID;

public class Student {
   private String name;
   private int grade;
  private   String id;

    public Student(String name, int grade) {
        this.id = UUID.randomUUID().toString();
        this.grade = grade;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Student{name= "+ name+ ", id= "+id +", grade= "+grade;
    }
}
