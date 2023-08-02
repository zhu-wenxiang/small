package com.demo;

abstract class AbstractDemo {

    int i;

    public AbstractDemo(){
        System.out.println("this is the AbstractDemo Contructor");
    }

    protected abstract void what();

    public void setField(int i){
        this.i=i;
    }

}

class Sub extends AbstractDemo{

    public Sub(){
        super();
        System.out.println("in the Sub()");
    }

    @Override
    protected void what() {
        System.out.println("in the overrided abstract method");
        System.out.println("i in the super class"+super.i);
    }

    public static void main(String[] args) {
        
        AbstractDemo abstractDemo=new Sub();
        abstractDemo.what();
    }
}
