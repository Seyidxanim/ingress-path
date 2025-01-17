package lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Toplama ucun +, vurma ucun * , cixma ucun -, bolme /");
        String k=scanner.next();

        switch (k){
            case "+":
                System.out.println(calculator.addition());
                break;
            case "/":
                System.out.println(calculator.division());
                break;
            case "-":
                System.out.println(calculator.subtraction());
                break;
            case "*":
                System.out.println(calculator.multiplication());
                break;
            default:
                System.out.println("it is not possible");





        }
    }
}
