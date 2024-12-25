import java.io.*;
public class FileOutDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("abc.txt");
            String s = "Virat Kohli is my favorite player";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}