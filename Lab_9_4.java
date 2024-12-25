public class Lab_9_4 {
    public static void main(String[] args) {
        book b1 = new book();
        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];
        if(s1.equals("book")){
            bookpublication b2 = new bookpublication();
            b1=b2;
        } else if (s1.equals("paper")) {
            paperpublication b3 = new paperpublication();
            b1=b3;
        }
        b1.setAuthor_name(s2);
        b1.setTitle(s3);
        b1.display();
    }
}
class book{
    String author_name;
    void setAuthor_name(String author_name){
        this.author_name=author_name;
    }
    String getAuthor_name(){
        return author_name;
    }
    void display(){}
    void setTitle( String s1){}
}
class bookpublication extends book{
     private String title;
    void setTitle(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }
    void display(){
        System.out.println("book details : "+getAuthor_name()+" "+ title);
    }
}
class paperpublication extends book{
    private String title;
    void setTitle(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }
    void display(){
        System.out.println("book details : "+ getAuthor_name()+ ", book title "+ title);
    }
}