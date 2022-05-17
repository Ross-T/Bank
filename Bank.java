import java.util.Scanner;

public class Bank {
    String name;
    String accNo;
    double balance;
    double lastTransaction;

    public void Account(String customerName, String accountNo) {
        name = customerName;
        accNo = accountNo;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Invalid request, withdrawal amount exceeds available balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid request, withdrawal amount must equal above £0");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of £" + amount + "successful, new balance: £" + balance);
        }
    }







    public static void main(String[] args) {
        
    }
}
