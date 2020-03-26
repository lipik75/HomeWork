package edu.academy;

import org.w3c.dom.ls.LSOutput;

public class MainPobitovyTwo {
    public static void main(String[] args) {
        //System.out.println(Integer.toBinaryString());
        int x = -42;
        int y = -15;
        System.out.println(~x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(~y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println(x & y);
        System.out.println(Integer.toBinaryString(x & y));
        System.out.println(x &= y);
        System.out.println(Integer.toBinaryString(x &= y));
        System.out.println(x | y);
        System.out.println(Integer.toBinaryString(x | y));
        System.out.println(x|= y);
        System.out.println(Integer.toBinaryString(x|= y));
        System.out.println(x ^ y);
        System.out.println(Integer.toBinaryString(x ^ y));
        System.out.println(x ^= y);
        System.out.println(Integer.toBinaryString(x ^= y));
        System.out.println(x >> 3);
        System.out.println(Integer.toBinaryString(x >> 3));
        System.out.println(y >> 3);
        System.out.println(Integer.toBinaryString(y >> 3));
        System.out.println(x >>= 3);
        System.out.println(Integer.toBinaryString(x >>= 3));
        System.out.println(y >>= 3);
        System.out.println(Integer.toBinaryString(y >>= 3));
        System.out.println(x >>> 3);
        System.out.println(Integer.toBinaryString(x >>> 3));
        System.out.println(y >>> 3);
        System.out.println(Integer.toBinaryString(y >>> 3));
        System.out.println(x >>>= 3);
        System.out.println(Integer.toBinaryString(x >>>= 3));
        System.out.println(y >>>= 3);
        System.out.println(Integer.toBinaryString(y >>>= 3));
        System.out.println(x << 3);
        System.out.println(Integer.toBinaryString(x << 3));
        System.out.println(y << 3);
        System.out.println(Integer.toBinaryString(y << 3));
        System.out.println(x <<= 3);
        System.out.println(Integer.toBinaryString(x <<= 3));
        System.out.println(y <<= 3);
        System.out.println(Integer.toBinaryString(y <<= 3));
    }
}
