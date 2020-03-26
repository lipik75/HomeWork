package edu.academy;

public class CalculatorWithOperator {

    public double division (double a, double b){
        double div = a/b;
        return div;
    }
    public double multiplication (double a, double b){
        double mul = a*b;
        return mul;
    }
    public double addition (double a, double b){
        double add = a + b;
        return add;
    }
    public double subtraction (double a, double b){
        double sub = a - b;
        return sub;
    }
    public double exponentiation (double a, int b){
        double exp = a;
        for (int i = 0; i < b-1; i++){
            exp *=a;
        }
        return exp;
    }
    public double module (double a){
        double mod;
        if (a < 0)
            mod = -a;
        else
            mod = a;
        return mod;
    }
    public double root (double a){
        double temp;
        double sqrt = a / 2;
        do{
            temp = sqrt;
            sqrt = (temp + (a / temp)) / 2;
        } while ((temp - sqrt) !=0);
        return sqrt;
    }
}
