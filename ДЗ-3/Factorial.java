package edu.academy;

public class Factorial {
    public int factorial (int n) {
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.printf("Факториал числа %d = "+result, n);
        return result;
    }
}
