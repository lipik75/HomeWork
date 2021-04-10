package edu.academy.calc;

public class CalcWithCounterConstructor1 implements ICalculator {
    private CalcWithMath calcWithMath;
    private CalcWithCounter calcWithCounter;
    private CalcWithMathExtends calcWithMathExtends;
    private int count;
    public  CalcWithCounterConstructor1(CalcWithMath calcWithMath){
        this.calcWithMath=calcWithMath;
    }

    public  CalcWithCounterConstructor1(CalcWithCounter calcWithCounter){
        this.calcWithCounter=calcWithCounter;
    }

    public  CalcWithCounterConstructor1(CalcWithMathExtends calcWithMathExtends){
        this.calcWithMathExtends=calcWithMathExtends;
    }

    private ICalculator getCalc(){
        if (calcWithCounter != null){
            return calcWithCounter;
        }
        else if(calcWithMath != null){
            return calcWithMath;
        } else {
            return calcWithMathExtends;
        }
    }

    @Override
    public double add(double a, double b) {
        count++;
        return getCalc().add(a, b);
    }

    @Override
    public double raznost(double a, double b) {
        count++;
        if (calcWithCounter != null){
            return calcWithCounter.raznost(a,b);
        }
        else{
            return calcWithMath.raznost(a,b);
        }
    }

    @Override
    public double delenie(double a, double b) {
        count++;
        if (calcWithCounter != null){
            return calcWithCounter.delenie(a,b);
        }
        else{
            return calcWithMath.delenie(a,b);
        }
    }

    @Override
    public double ymn(double a, double b) {
        count++;
        if (calcWithCounter != null){
            return calcWithCounter.ymn(a,b);
        }
        else{
            return calcWithMath.ymn(a,b);
        }
    }

    @Override
    public double step(double a, double b) {
        count++;
        if (calcWithCounter != null){
            return calcWithCounter.step(a,b);
        }
        else{
            return calcWithMath.step(a,b);
        }
    }
}
