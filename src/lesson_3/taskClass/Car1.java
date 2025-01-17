package lesson_3.taskClass;

public class Car1 {
    private Feature feature;

    public static void main(String[] args) {
        Car1 car1=new Car1();
        car1.feature=new Feature("name","model",2024);
        car1.feature.year=2024;
        car1.feature.model="model";
        car1.feature.name="name";

        Car1 car11=new Car1();
        car11.feature=car1.feature;
        
        
    }
}
