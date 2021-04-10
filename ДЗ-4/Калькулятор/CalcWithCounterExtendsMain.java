package edu.academy.calc;

public class CalcWithCounterExtendsMain {
    public static void main(String[] args) {
        CalcWithCounterExtends calc = new CalcWithCounterExtends();
        System.out.println(calc.getCounter());
        calc.add(3,4);
        System.out.println(calc.getCounter());
    }
}
