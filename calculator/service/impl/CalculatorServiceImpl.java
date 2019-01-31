package service.impl;

import dao.CalculatorDAO;
import dao.impl.CalculatorDAOImpl;
import service.CalculatorService;

/**
 * Created by Amrit on 1/3/2019.
 */
public class CalculatorServiceImpl implements CalculatorService {

    CalculatorDAO calculatorDAO = new CalculatorDAOImpl();

    @Override
    public int addition(int a, int b) {
        return calculatorDAO.addition(a, b);
    }

    @Override
    public int subtraction(int a, int b) {
        return calculatorDAO.subtraction(a, b);
    }

    @Override
    public int multiplication(int a, int b) {
        return calculatorDAO.multiplication(a, b);
    }

    @Override
    public int division(int a, int b) {
        return calculatorDAO.division(a, b);
    }
}
