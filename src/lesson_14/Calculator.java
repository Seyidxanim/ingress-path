package lesson_14;

import java.util.HashMap;
import java.util.Scanner;


@FunctionalInterface
interface Operation {
    double execute(double a, double b);
}


public class Calculator {
    public static void main(String[] args) {
        HashMap<String, Operation> hashMap = new HashMap<>();
        hashMap.put("+", (num1, num2) -> num1 + num2);
        hashMap.put("-", (num1, num2) -> num1 - num2);
        hashMap.put("*", (num1, num2) -> num1 * num2);
        hashMap.put("/", (num1, num2) -> num2 != 0 ? num1/num2 : Double.NaN);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the operation");
        String operation = scanner.next();


        Operation operation1 = hashMap.get(operation);
        System.out.println(operation1.execute(number1, number2));

    }
}

