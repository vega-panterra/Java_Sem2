package Sem2;

import java.util.Scanner;

public class Task4 {
 //   private static Logger logger = Log.log(Task4.class.getName());

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.println("Введите выбранного оператора из следующих действий: +, -, *, /");
        int operator = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        int number2 = scan.nextInt();
        int result;

        if (operator == '+') {
            result = number1 + number2;
 //           logger.log(Level.INFO, "Результат = " + result, StandardCharsets.UTF_8);
            System.out.println(number1 + " + " + number2 + " = " + result);
        }

        if (operator == '-') {
            result = number1 - number2;
 //           logger.log(Level.INFO, "Результат = " + result);
            System.out.println(number1 + " - " + number2 + " = " + result);
        }

        if (operator == '*') {
            result = number1 * number2;
 //           logger.log(Level.INFO, "Результат = " + result);
            System.out.println(number1 + " * " + number2 + " = " + result);
        }

        if (operator == '/') {
            result = number1 / number2;
  //          logger.log(Level.INFO, "Результат = " + result);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }

        if (operator != '-' && operator != '+' && operator != '/' && operator != '*') {
            System.out.println("Введите выбранного оператора из следующих действий: +, -, *, /");
        }
        scan.close();
    }
}