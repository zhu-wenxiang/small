class SuperClass {

    private int i = 1;

    public int getI() {
        // this找field只会在本类找，不会去子类，如果没有就报错
        return this.i;
    }

    public SuperClass() {
        System.out.println("这里获取到的:" + this.getClass());
        System.out.println("当前的i是：" + this.i);
        System.out.println("当前调用的是1还是2：" + this.getI());
        System.out.println(toString());
    }

    public int getII() {
        return this.getI();
    }
}

public class InheritanceClass extends SuperClass {
    int i = 2;

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        InheritanceClass inheritanceClass = new InheritanceClass();
        System.out.println("here is the super class this.i" + inheritanceClass.getII() + inheritanceClass.getI());
        SuperClass su = new SuperClass();
        SuperClass su2Class = new InheritanceClass();
    }
}