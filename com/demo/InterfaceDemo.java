package com.demo;

interface InterfaceDemo {
    
    public int i=10;

    void demo1();

    default void demo2(){
        System.out.println("this is the demo2() method");
    }

    interface inner{
        void ss();
    }

    default void demo3(){
        System.out.println("i could have lots of default methods");
    }
}

class Demo1 implements InterfaceDemo,InterfaceDemo.inner{

    @Override
    public void demo1() {
        System.out.println("this is the demo1() in the demo1 objects");
        int i=InterfaceDemo.i;
        System.out.println("the i in the Interface "+i);
    }

    private static final class DemoDemo{

        private int i=0;
        public static final int MAX=1011;
    }


    public static void main(String[] args) {
        InterfaceDemo demo1=new Demo1();
        demo1.demo1();
        demo1.demo2();
        demo1.demo3();
        System.out.println();
    }

    public DemoDemo getDemoDemo(){
        return null;
    }
    @Override
    public void ss() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ss'");
    }



}
