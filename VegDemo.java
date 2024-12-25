// The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a program that demonstrates how to establish this class hierarchy. Declare
// one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects. Override the toString() method of object to return a
// string with the name of vegetable and its color
abstract class Vegetable{
    String color;
}
class Potato extends Vegetable{
    String name;
    Potato(String name,String color){
        this.color= color;
        this.name=name;
    }
    public String toString(){
        return name+" "+color;
    }
}
class Brinjal extends Vegetable{
    String name;
    Brinjal(String name,String color){
        this.color= color;
        this.name=name;
    }
    public String toString(){
        return name+" "+color;
    }
}
class Tomato extends Vegetable{
    String name;
    Tomato(String name,String color){
        this.color= color;
        this.name=name;
    }
    public String toString(){
        return name+" "+color;
    }
}
public class VegDemo {
    public static void main(String[] args) {
      Potato p1 = new Potato("potato","yellow");
        System.out.println(p1);
        Brinjal b1 = new Brinjal("brinjal","purple");
        System.out.println(b1);
        Tomato t1 = new Tomato("tomato","red");
        System.out.println(t1);
    }
}