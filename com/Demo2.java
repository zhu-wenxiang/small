package com;

public class Demo2 {

    public static void main(String[] args) {
        int i = 0;
        for (; i<15;i++) {
            System.out.println("befor the inner iteration");
            for (int k=0; k < 10; k++) {
                if (k == 5){
                    System.out.println("this is the inner iteration"+"i="+i);
                    break;
                }
                System.out.println("in the k iteration");
            }
            System.out.println("this is the outer iteration");
        }
    }
}
