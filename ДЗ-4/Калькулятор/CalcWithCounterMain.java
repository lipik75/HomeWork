package edu.academy.calc;

public class CalcWithCounterMain {
    public static void main(String[] args) {
        CalcWithCounter calc = new CalcWithCounter();
        System.out.println(calc.getCounter());
        calc.add(3,4);
        System.out.println(calc.getCounter());
    }
}
