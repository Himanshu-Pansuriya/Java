import java.util.Scanner;
class Shape {
     int l;
}
class Triangle extends Shape{
     void triangle(){
         Scanner s = new Scanner(System.in);
         double b = s.nextDouble();
         double area = 0.5 * l * b ;
         System.out.println(area);
     }
}
class Square extends Shape{
    void square(){
        double l = super.l;
        double area = l * l ;
        System.out.println(area);
    }
}
class Circle extends Shape{
    void circle(){
        double l = super.l;
        double area = 3.14 * l * l ;
        System.out.println(area);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
         Triangle t = new Triangle(l);
         t.triangle();
         Square s = new Square();
         s.square();
         Circle c = new Circle();
         c.circle();
    }
}