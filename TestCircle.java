public class TestCircle {
    public static void main(String[] args) {
        //Circle circle1=new Circle();
        //Circle circle2=new Circle();
        Object circle1=new Circle();
        Object circle2=new Circle();
        System.out.println(circle1.equals(circle2));
    }
}

class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){
    }
    public boolean equals(Circle circle){
        return this.radius==circle.radius;
    }
   /*  public boolean equals(Object c){
        return this.radius==((Circle)c).radius;
    } */
}