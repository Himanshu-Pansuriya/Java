import java.util.*;
class Gcd1 {
    static int gcd(int a, int b) {

        int i;
        if (a < b){
            i = a;
        }
        else{
            i = b;
        }
        for (i = i; i > 1; i--) {
 
            if (a % i == 0 && b % i == 0){

                return i;
            }
        }
        return 1;

    }
    public static void main(String[] args){

       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 1st number :");
       int a = sc.nextInt();
       System.out.println("Enter 2nd number :");
       int b = sc.nextInt();

        System.out.println("GCD = " + gcd(b, a));

    }
}
