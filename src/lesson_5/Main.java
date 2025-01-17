package lesson_5;

public class Main {
    public static void main(String[] args) {
        StudentArray.add(new Student("nermin",49));
        StudentArray.add(new Student("ner",99));
        StudentArray.add(new Student("neokmr",79));
        StudentArray.add(new Student("neokmr",79));
        StudentArray.add(new Student("neokmr",19));
        StudentArray.add(new Student("neokmr",69));
        StudentArray.add(new Student("neokmr",79));
        StudentArray.add(new Student("neokmr",29));
        StudentArray.add(new Student("dneokmr",79));
        StudentArray.add(new Student("dneokmr",39));
        StudentArray.add(new Student("dneokmr",39));
        StudentArray.add(new Student("dneokmr",49));


        //System.out.println("All students: ");
      //  StudentArray.printAllStudent();

        System.out.println("Students with grades greater than 80: ");
        StudentArray.printAllStudentsGradeGreaterThan(600);
    }
}
