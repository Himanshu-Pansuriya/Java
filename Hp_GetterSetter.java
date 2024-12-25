
class MyEmployee{
   private int id ;
   private String name;

    public String getName() { return name; }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
public class Hp_GetterSetter {
    public static void main(String[] args) {
        MyEmployee hp = new MyEmployee();
       // hp.id = 21;
       // hp.name = "CodeWithHimanshu"; // throw an error due to a private access specifier.
        hp.setName("CodeWithHimanshu");
        System.out.println(hp.getName());
    }
}
