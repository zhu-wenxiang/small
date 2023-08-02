package com;

import com.demo.BaseBase;

class Value {

    int j;

    public Value() {
    }

    public Value(int iii) {
        j = iii;
        System.out.println("the value object with value " + iii);
    }

    private void privateOverride(){
       System.out.println("这是基类的方法");
    }
}

public class ChildChild extends BaseBase {

    private Integer ii;
    private final Value value_2 = new Value(10000);

    public ChildChild() {
        this.access();
        System.out.println(ii+"childchild constructor");
    }

    public void access() {
        this.ii = super.i;
        System.out.println("ii in the basebase " + super.ii);
    }

    public void privateOverride(){
        System.out.println("这是派生类的override方法");
    }

    public static void main(String[] args) {
        ChildChild child = new ChildChild();
        Value valu=child.value_2;
        BaseBase childOver=new ChildChild();

    }

}
