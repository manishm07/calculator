import controller.CalculatorController;

import java.util.Scanner;

/**
 * Created by Amrit on 1/3/2019.
 */
public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController(input);

        while (true) {
            calculatorController.process();
        }
    }
}
