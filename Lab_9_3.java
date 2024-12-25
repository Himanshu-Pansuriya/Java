//The Transport interface declares a deliver() method. The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is
//implemented by the Camel and Donkey classes. Write a test program that initialize an array of four Animal objects.If the object implements the Transport interface,
//the deliver () method is invoked.
interface Transport{
     void deliver();
}
abstract class Animal implements Transport{
     public void deliver(){
          System.out.println("This is deliver a Animal Class which implements from transport interface");
      }
      void eat(){
          System.out.println("This is eat method of a Animal Class which implements from transport interface");
      }
}
class Tiger extends Animal{
   public void deliver(){
        System.out.println("This is deliver a Tiger Class which implements from transport interface");
    }
    void eat(){
        System.out.println("This is eat method of a Tiger Class which implements from transport interface");
    }
}
class Camel extends Animal{
   public void deliver(){
        System.out.println("This is deliver a Camel Class which implements from transport interface");
    }
    void eat(){
        System.out.println("This is eat method of a Camel Class which implements from transport interface");
    }
}
class Deer extends  Animal{
   public void deliver(){
        System.out.println("This is deliver a Deer Class which implements from transport interface");
    }
    void eat(){
        System.out.println("This is eat method of a Deer Class which implements from transport interface");
    }
}
class Donkey extends  Animal{
   public void deliver(){
        System.out.println("This is deliver a Donkey Class which implements from transport interface");
    }
    void eat(){
        System.out.println("This is eat method of a Donkey Class which implements from transport interface");
    }
}
public class Lab_9_3 {
    public static void main(String[] args) {
        Animal a[] = new Animal[4];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        a[1].eat();
    }
}