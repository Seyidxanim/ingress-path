package lesson_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomerPipeline {
    public static void main(String[] args) {
        //capitalize  city
        //30 dan yuxari filtirle 1500 den cox olanlara 10%
        List<Customer> listCustomer= Arrays.asList(
                new Customer("Lala",35,1700, "Baku"),
                new Customer("Bob",43,1200,"london"),
                new Customer("Nurlan" ,51,2000,"istanbul"),
                new Customer("Jale",23,1200,"New York")

        );
    }


//    public List<Customer> capitalizeCity(List<Customer> list){
//
//
//    }


}
