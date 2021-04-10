package edu.academy.calc;

public class CalcWithCounterConstructor2 implements ICalculator {
    private ICalculator calc;
    private int count;
    public CalcWithCounterConstructor2(ICalculator calcWithMath){
        this.calc=calcWithMath;
    }

    @Override
    public double add(double a, double b) {
        count++;
        return calc.add(a, b);
    }

    @Override
    public double raznost(double a, double b) {
        count++;
        return calc.raznost(a, b);
    }

    @Override
    public double delenie(double a, double b) {
        count++;
        return calc.delenie(a, b);
    }

    @Override
    public double ymn(double a, double b) {
        count++;
        return calc.ymn(a, b);
    }

    @Override
    public double step(double a, double b) {
        count++;
        return calc.step(a, b);
    }
}
