package edu.academy.calc;

public class CalcWithCounterExtends extends CalcWithOperator implements ICalculator {
    private int counter;
    public double add(double a,double b){
        this.counter++;
        return super.add(a,b);
    }
    public double raznost (double a,double b){
        this.counter++;
        return super.raznost(a,b);
    }
    public double delenie (double a,double b){
        this.counter++;
        return super.delenie(a,b);
    }
    public double ymn (double a,double b){
        this.counter++;
        return super.ymn(a,b);
    }
    public double step (double a,double b){
        this.counter++;
        return super.step(a,b);
    }
    public int getCounter(){
        return counter;
    }
}
