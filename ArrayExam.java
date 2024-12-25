import java.util.Scanner;
public class ArrayExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many element in java you want");
        int n = sc.nextInt();
      //  String args[] = new String[n];
        for (int i=0;i<n;i++){
            System.out.println("enter" +(i+1)+"th element:");
            args[i]=sc.next();
        }
        try{
            if(n<0 || n%10==0 || (n>1000 && n<2000) || n>7000) {
                throw new Exception("invalid value");
            }
                else{
                    System.out.println("valid value");
                }
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("program is over");
        }
        }
    }