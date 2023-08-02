package com.demo;

import com.ChildChild;

public class BaseBase {

    protected static int i = 10;
    protected int ii=100;
    private float f1=2000.0f;
    
    //static int i = 0;
    {
        System.out.println("this is the basebase instance initialization");
    }

    static{
        System.out.println("this is the static basebase initialization block");
    }

    public BaseBase() {
        System.out.println(" this is the basebase constructor");
        getget(this.ii);
        print();
        System.out.println("basebase constructor over");
    }

    static void print() {
        System.out.println("print() in the basebase class");
    }

    protected int printIntField(int i){
        System.out.println("initialize field int i: "+i);
        return i;
    }

     private void privateOverride(){
       System.out.println("这是基类的方法");
    }

    protected void getget(int mymy){
        System.out.println("this is the getget() in the basebase "+mymy);
    }
    public static void main(String[] args) {
        BaseBase basebase=new ChildChild();
        basebase.privateOverride();
    }
}

class Child1 extends BaseBase{
    int ii=0;

    public int getBase(){
        return super.ii;
    }

    public int getChildInteger(){
        return ii;
    }


    @Override
    public void getget(int mayum){
        System.out.println("this is the getget() in the Child1"+mayum);
    }

    static void print(){
        System.out.println("the print method in the child");
    }

    public static void main(String[] args) {
        Child1 child1=new Child1();
        System.out.println("in the Child1 "+child1.getBase()+"\t"+child1.getChildInteger());
    }
}