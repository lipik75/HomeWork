package edu.academy.calc;

public class CalcWithCounter implements ICalculator{

    private int counter;

    public int getCounter() {
        return counter;
    }

    public double add(double a, double b){
        this.counter++;
        double c=a+b;
        return c;
    }
    public double raznost (double a,double b){
        this.counter++;
        double c=a-b;
        return c;
    }
    public double delenie (double a,double b){
        this.counter++;
        double c=a/b;
        return c;
    }
    public double ymn (double a,double b){
        this.counter++;
        double c=a*b;
        return c;
    }
    public double step (double a,double b){
        this.counter++;
        double c = Math.pow(a,b);
        return c;
    }
}
