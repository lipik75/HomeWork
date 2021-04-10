package edu.academy.calc;

public class CalcWithMathExtends extends CalcWithOperator implements ICalculator{

    @Override
    public double step(double a, double b) {
        return Math.pow(a, b);
    }
}
