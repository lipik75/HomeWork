package edu.academy;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

//        4.1 + 15 * 7 + (28 / 5) ^ 2;
        double a = calculator.division (28, 5);
        double b = calculator.exponentiation (a, 2);
        double c = calculator.multiplication (15, 7);
        double d = calculator.addition (4.1, c);
        double e = calculator.addition (d, b);
        System.out.println(e);
    }
}
