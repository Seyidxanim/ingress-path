package lesson_17;

public class Customer {
    String name;
    int age;

    double spending;

    String city;


    Customer(String name, int age, double spending,String city){
        this.name=name;
        this.age=age;
        this.spending=spending;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSpending() {
        return spending;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spending=" + spending +
                ", city='" + city + '\'' +
                '}';
    }
}
