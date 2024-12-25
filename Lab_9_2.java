//2.Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(),
//mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased()
//methods. WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener {
   void mouseClicked();
   void mousePressed();
   void mouseReleased();
   void mouseMoved();
   void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener{
   public void mouseClicked(){
        System.out.println(" mouse clicked by user");
    }
   public void mousePressed(){
        System.out.println("mouse pressed by user");
    }
   public void mouseReleased(){
        System.out.println("mouse released");
    }
   public void mouseMoved(){
        System.out.println("mouse moved");
    }
   public void mouseDragged(){
        System.out.println("mouse dragged");
    }
   public void keypressed(){
        System.out.println("key pressed");
    }
   public void keyReleased(){
        System.out.println("key released");
    }
   public void performEvent(){
        System.out.println("event performed");
    }
}
public class Lab_9_2 {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseReleased();
        e.mousePressed();
        e.mouseMoved();
        e.mouseDragged();
        e.mouseClicked();
        e.keypressed();
        e.keyReleased();
    }
}