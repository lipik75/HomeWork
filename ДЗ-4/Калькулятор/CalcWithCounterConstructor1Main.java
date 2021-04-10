package edu.academy.calc;

public class CalcWithCounterConstructor1Main {
    public static void main(String[] args) {
        CalcWithCounter calcWithCounter = new CalcWithCounter();
        CalcWithCounterConstructor1 calc = new CalcWithCounterConstructor1(calcWithCounter);
        CalcWithMath calcWithMath = new CalcWithMath();
        CalcWithCounterConstructor1 calc2 = new CalcWithCounterConstructor1(calcWithMath);
        CalcWithCounterConstructor1 calc3 = new CalcWithCounterConstructor1(new CalcWithMath());
    }
}
