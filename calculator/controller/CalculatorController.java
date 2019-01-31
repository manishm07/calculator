package controller;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

import java.util.Scanner;

/**
 * Created by Amrit on 1/3/2019.
 */
public class CalculatorController {

    Scanner input;
    CalculatorService calculatorService = new CalculatorServiceImpl();

    public CalculatorController(Scanner input) {
        this.input = input;
    }

    public void menu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public void process() {
        menu();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addValue();
                break;
            case 2:
                subtractionValue();
                break;
            case 3:
                multiplicationValue();
                break;
            case 4:
                divisionValue();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }

    public void addValue() {
        System.out.println("PERFORM ARITHMETIC OPERATION");
        System.out.println("Enter 1st Number");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number");
        int b = input.nextInt();
        System.out.println("The addition of two value is :" + calculatorService.addition(a, b));
    }

    public void subtractionValue() {
        System.out.println("PERFORM SUBTRACTION OPERATION");
        System.out.println("Enter 1st Number");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number");
        int b = input.nextInt();
        System.out.println("The subtraction of two value is :" + calculatorService.subtraction(a, b));
    }

    public void multiplicationValue() {
        System.out.println("PERFORM MULTIPLICATION OPERATION");
        System.out.println("Enter 1st Number");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number");
        int b = input.nextInt();
        System.out.println("The multiplication of two value is :" + calculatorService.multiplication(a, b));
    }

    public void divisionValue() {
        System.out.println("PERFORM DIVISION OPERATION");
        System.out.println("Enter 1st Number");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number");
        int b = input.nextInt();
        System.out.println("The division of two value is :" + calculatorService.division(a, b));
    }
}
