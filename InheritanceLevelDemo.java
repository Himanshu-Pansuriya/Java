// 1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.
import java.util.Scanner;
public class InheritanceLevelDemo {
    public static void main(String[] args) {
         Student s = new Student();
         s.Human1();
         s.Student1();


    }
}
class Human {
   void Human1() {
       System.out.println("This is a Human class ");
       System.out.println("hhh");
   }
}
class Student extends Human{
    void Student1() {
        super.Human1();
        System.out.println("This is a Student class which inherit from Human class");
        System.out.println("nnn");
    }
}