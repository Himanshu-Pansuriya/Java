// 3. WAP for implementing single inheritance which creates one class account_details for getting account information and another class interest for calculating and displaying total interest from the data inserted from account details.

import java.util.Scanner;

public class ans3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("enter principal amount");
      int p = sc.nextInt();
      System.out.println("enter rate of interest");
      int r = sc.nextInt();
      System.out.println("enter a duration of interest in year");
      int n = sc.nextInt();
      interest topay = new interest();
      topay.intr(p,r,n);

  }
}
  class account_details{
      int p,r,n;
      void getAccount_details(int p,int r,int n){
          this.p=p;
          this.n=n;
          this.r=r;

      }
  }
class interest extends account_details {
    void intr(int p, int r, int n){
        System.out.println("total interest of amount is" + ((p * r * n)/100));
    }
}