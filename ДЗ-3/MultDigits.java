package edu.academy;

public class MultDigits {
    public int multDigits(int a) {
        String s = Integer.toString(a);
        int q = s.length();
        int result = 1;
        System.out.printf("Порядок умножения цифр из числа %d обозначается как: ", a);
        for (int j = 0; j < q; j++) {
            int b;
            b = a % 10;
            a = a / 10;
            result = result*b;
            if (a!=0){
                System.out.print(b+" * ");
            }
            else{
                System.out.print(b);
            }
        }
        System.out.println(". Результат умножения равен: "+result);
        return result;
    }
}
