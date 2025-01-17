package lesson_3.taskClass;

public class Car {
    // object's state, hali , properties
  public String name;
  public String model;
  public int year;


  public Car(){

  }
  public  Car(String name){
      this.name=name;
  }

  //behaviour , davranish
  public void printName(){
      System.out.println(name);
  }

    @Override
    public String toString() {
//        return "Car [name: %s, model: %s, year: %s]"
//                .formatted(this.name,this.model, this.year);

      //  return this.name + " " + this.model + " " + this.year + " ";

        return  "Car [%s, %s, %d]".formatted(this.name,this.model,this.year);
    }


    public static void main(String[] args) {
        Car car=new Car();
        car.name="name";
        car.model="model";
        car.year=2022;
        System.out.println(car.toString());
    }
}
