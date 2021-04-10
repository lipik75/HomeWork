package edu.academy.calc;

public class CalcWithMath implements ICalculator {
    public double add(double a,double b){
        double c=a+b;
        return c;
    }
    public double raznost (double a,double b){
        double c=a-b;
        return c;
    }
    public double delenie (double a,double b){
        double c=a/b;
        return c;
    }
    public double ymn (double a,double b){
        double c=a*b;
        return c;
    }
    public double step (double a,double b){
        double c = Math.pow(a,b);
        return c;
    }
}
