package edu.academy.calc;

public class CalcWithOperator implements ICalculator{
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
        double c=1;
        for (int i = 0; i <b ; i++) {
            c=c*a;
        }
        return c;
    }
}
