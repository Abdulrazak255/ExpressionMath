package be.intecbrussel.MathExpressionEvaluator.service;

public class basicMathServiceImpl implements BasicMathService {
    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber+firstNumber ;
    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return 0;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return 0;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return 0;
    }
}
