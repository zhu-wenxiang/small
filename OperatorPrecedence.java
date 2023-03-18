
public class OperatorPrecedence {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int j=(int)Math.random()*10;
            System.out.println(j);
        }
        System.out.printf("%5d\n",15);
        System.out.printf("%5d", 666);
        System.out.println();
        EnumPrac e1=EnumPrac.Monday;
        EnumPrac e2=EnumPrac.Friday;
        System.out.println(e1.compareTo(e2));
        System.out.println(e1.getDeString()+e2.getDesInt());
    }
    //System.out.println(RegularExpression.n);
}
