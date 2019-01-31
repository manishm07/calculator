package dao.impl;

import dao.CalculatorDAO;

/**
 * Created by Amrit on 1/3/2019.
 */
public class CalculatorDAOImpl implements CalculatorDAO {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
