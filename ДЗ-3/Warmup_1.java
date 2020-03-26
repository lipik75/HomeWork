package edu.academy;

public class Warmup_1 {
    public static void main(String[] args) {

    // warmup-1
    public boolean sleepIn (boolean weekday, boolean holiday){
        if (weekday || holiday) {
            return true;
            }
        return false;
    }

    //warmup-2
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }
    //warmup-3
    public int SumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return (a + b) * 2;
    }
    //warmup-4
    public int diff21(int n){
        if (n>21){
            return (n-21)*2;
        }
        else {
            return (21-n);
        }
    }
    //warmup-5
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 && hour >20)){
            return true;
        }
        return false;
    }
    //warmup-6
    public boolean makes10(int a, int b){
        if ((a == 10 || b == 10) || (a+b==10)){
            return true;
        }
        return false;
    }
    //warmup-7
    public boolean nearHundred(int n){
        if (n<90 || (n>110 || n<190) || (n>210)) {
            return true;
        }
        return false;
    }
    //warmup-8
    public boolean posNeg(int a, int b, boolean negative){
        if (negative){
            return (a<0 && b<0);
        }
        return ((a<0 && b>0) || (b<0 && a>0));
    }
    //warmup-9
    public String notString(String str){
        if (str.length()>=3 && str.substring(0, 3).equals("not")){
            return str;
        }
        return "not "+str;
    }
    //warmup-10
    public String missingChar(String str, int n){
        String a = str.substring(0, n);
        String b  = str.substring(n+1, str.length());
        return a+b;
    }
    //warmup-11
    public String frontBack(String str){
        if (str.length()<=1){
            return str;
        }
        String b = str.substring(1, str.length()-1);
        char a = str.charAt(0);
        char c = str.charAt(str.length()-1);
        return c+b+a;
    }
    //warmup-12
    public String front3(String str){
        if (str.length()<3){
            return str+str+str;
        }
        else{
            String s1 = str.substring(0, 3);
            return s1+s1+s1;
        }
    }
    //warmup-13
    public String backAround(String str){
        String a = str.substring(str.length()-1);
        return a+str+a;
    }
    //warmup-14
    public boolean or35(int n){
        if (n%3==0 || n%5==0){
            return true;
        }
        return false;
    }
    //warmup-15
    public String front22(String str) {
        if (str.length()<2){
            return str+str+str;
        }
        else{
            String s = str.substring(0, 2);
            return s+str+s;
        }
    }
    //warmup-16
    public boolean startHi(String str){
        if (str.startsWith("hi")){
            return true;
        }
        return false;
    }
    //warmup-17
    public boolean icyHot(int temp1, int temp2){
        if ((temp1<0 && temp2>100)|| (temp1>100 && temp2<0)){
            return true;
        }
        return false;
    }
    //warmup-18
    public boolean in1020(int a, int b){
        if ((a>=10 && a<=20)||(b>=10 && b<=20)){
            return true;
        }
        return false;
    }
    //warmup-19
    public boolean hasTeen(int a, int b, int c){
        if (a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19){
            return true;
        }
        return false;
    }
    //warmup-20
    public boolean loneTeen(int a, int b){
        if ((a>=13 && a<=19 && b>=13 && b<=19) ||a==b){
            return true;
        }
        return false;
    }
    //warmup-21
    public String  delDel(String str){
        if (str.startsWith("del", 1)==true && str.length()>=4){
            String s1 = str.substring(0,1);
            String s2 = str.substring(4);
            return s1+s2;
        }
        return str;
    }
    //warmup-22
    public boolean mixStart(String str){
        if (str.startsWith("ix", 1)){
            return true;
        }
        return false;
    }
    //warmup-23
    public String startOz(String str){
        if (str.startsWith("oz")==true){
            return str.substring(0, 2);
        }
        else if (str.startsWith("z", 1)==true){
            return str.substring(1, 2);
        }
        else if (str.startsWith("o", 0)==true){
            return str.substring(0, 1);
        }
        return "";
    }
    //warmup-24
    public int intMax(int a, int b, int c){
        int mus [] = {a, b, c};
        int a1 = mus [0];
            for (int i = 0; i < mus.length; i++) {
                if (a1<mus[i]){
                    a1 = mus[i];
                }
            }
        return a1;
    }
    //warup-25
    public int close10(int a, int b){
        int num1 = Math.abs(a-10);
        int num2 = Math.abs(b-10);
        if (num1<num2){
            return a;
        }
        else{
            return b;
        }
        return 0;
    }
    //warmup-26
    public boolean in3050(int a, int b){
        if (a>=30&&b>=30&&a<=40&&b<=40){
            return true;
        }
        else if (a>=40&&b>=40&&a<=50&&b<=50){
            return true;
        }
        return false;
        }
    //warmup-27
    public int max1020(int a, int b){
        if (b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        if (a>=10 && a<=20){
            return a;
        }
        else if (b>=10&&b<=20){
            return b;
        }
        return 0;
        }
    //warmup-28
    public boolean stringE(String str) {
    char a [] = notString.toCharArray();
    int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=1;
        }
    if (sum>=1&&sum<=3){
        return true;
    }
    return false;
    }
    //warmup-29
    public boolean lastDigit(int a, int b){
    int alastnum = a%10;
    int blastnum = b%10;
    if (alastnum == blastnum){
        return true;
    }
    return false;
    }
    //warmup-30
    public String endUp(String str){
        if (str.length()<3){
            return str.toUpperCase();
        }
        else {
            String strUp = strUp.substring(strUp.length()-3);
            return strUp+ strUp.toUpperCase();
        }
    }
    //warmup-31
    public String everyNth(String str, int n){
    String str1 = "";
            for (int i = 0; i < str1.length(); i+=n) {
                str1 = str1.charAt(i);
            }
            return str1;
        }
    }
}



