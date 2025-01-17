package lesson_5;

import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class StudentArray {
    private static final Student[] students = new Student[10];

    public static void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public static void printAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printAllStudentsGradeGreaterThan(int grade) {
        boolean k = false;
        for (Student student : students) {
            if (student.getGrade() >= grade) {
                System.out.println(student.getName());
                k = true;
            }
        }
        if (!k) {
            System.out.println(grade + " no students found with grade greater than");
        }

    }
}
