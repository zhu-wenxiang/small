package com.demo;

public class Demo{

    public static void main(String[] args) {
        System.out.println("this is the demo in com.demo");
        short c1=0x7fff;
        short c2=0;
        c2=(short)(c1+1);
        System.out.println(c2);
        int a=-1;
        int b=+a;
        System.out.println(b);
        char cc='c';
        System.out.println(Integer.toBinaryString(cc));
        byte b1=-2;
        System.out.println((b1>>>10)+"\t"+Integer.toBinaryString(b1)+"\t"+Integer.toBinaryString(b1>>>10));
        System.out.println((0%5)+" ");

    }
}