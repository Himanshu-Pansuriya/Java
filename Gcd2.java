import java.util.Scanner;
public class Gcd2 {
       public static int gcd(int num1,int num2){
          int c=1;
        for(int i=2;i<num1 && i<num2;i++){
            if (num1%i==0 && num2%i==0){
                c=i;
            }
        }
        return c; 
       }
    public static void main(String[] args)
    {    
        int answer=0;
        Gcd2 o1 = new Gcd2() ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        System.out.println("Enter b number");
        int num2=sc.nextInt();

        answer= Gcd2.gcd(num1,num2);

        System.out.println("GCD="+ answer);
    }
    
}