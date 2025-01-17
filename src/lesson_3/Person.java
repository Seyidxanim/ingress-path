package lesson_3; // 2 ve 3 suallarin cavabi asagidadir

public class Person {
    public String name;
    public int age;

    {
        name = "Static";

    }

    {
        age=7;
    }
    public Person(){
        name = "Anonim";
        age=25;
    }


    public static void main(String[] args){
        Person person=new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }
}



/*
 sual 2: kod main metoddan icra olunmaga baslayacaq.new InitializationOrder() deyerek constructor cagiririq
 ona gore de constructora daxil oluruq, bloklarin icra olunma ardiciligina nezer salsaq ilk once instance
 bloklar icra edilir,daha sonra constructor daxilindeki kodlar. Sonda ekrana cixacaq neticeler:
 Instance Block 1
 Instance Block 2
 Constructor
 */


/*
  sual 3: kod main metoddan icra olunmaga baslayacaq.new FieldInitialization() deyerek constructora daxil oluruq,
  daha sonra String tipinde message adinda, deyeri "Field" olan deyisen yaradilir.Novbeti stepde instance blok icra edilir,
  message deyisenine "Instance Block" deyeri oturulur.Sonda yene constructor daxik oluruq message "Constructor"
  deyeri oturulur. message="Constructor" olur.Main metoda qayidilir , alt siradaki cap emri icra edilir
  ve ekrana Constructor sozu cap olunur.
 */