import java.util.Scanner;
class BankAccount {
    private int balance = 12000;

    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount to withdraw = ");
        int amountToWithdraw = sc.nextInt();

        if (amountToWithdraw < balance) {
            balance = balance - amountToWithdraw;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void printBalance() {
        System.out.println(("current Balance = " + balance));
    }
}
public class BankBalance{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.printBalance();
        ba.withdraw();
        ba.printBalance();
    }
}