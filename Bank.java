import java.util.Scanner;

public class Bank {
    String name;
    int accNo;
    double balance;
    double lastTransaction;
    double amount;

    public Bank(String customerName, int accountNo) {
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
            lastTransaction = -amount;
            System.out.println("Withdrawal of £" + amount + " successful, new balance: £" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid request, deposit amount must equal above £0");
        } else {
            balance += amount;
            lastTransaction = amount;
            System.out.println("Deposit of £" + amount + " successful, new balance: £" + balance);
        }
    }

    public void mostRecentTransaction() {
        if (lastTransaction < 0) {
            System.out.println("====Your most recent transaction====");
            System.out.println();
            System.out.println("Withdrawn: £" + lastTransaction);
        } else if (lastTransaction > 0) {
            System.out.println("====Your most recent transaction====");
            System.out.println();
            System.out.println("Deposited: £" + lastTransaction);
        } else {
            System.out.println("No recent transactions to display.");
        }
    }

    public void displayMenu() {
        char option;
        char chosenOption;
        Scanner fetch = new Scanner(System.in);
        System.out.println("Welcome, " + name + "!");
        System.out.println("Account Number: " + accNo);
        System.out.println();
        System.out.println("What would you like to do today?");
        System.out.println();
        System.out.println("Options:");
        System.out.println("A - Make a withdrawal");
        System.out.println("B - Make a deposit");
        System.out.println("C - Check your balance");
        System.out.println("D - View your most recent transaction");
        System.out.println("E - Exit");

        System.out.println();
        System.out.println();
        System.out.println("Please enter an option:");
        chosenOption = fetch.next().charAt(0);
        option = Character.toUpperCase(chosenOption);
        System.out.println();

        switch(option) {
            case 'A':
                System.out.println("Please enter amount to withdraw: ");
                amount = fetch.nextDouble();
                System.out.println();
                withdraw(amount);
                System.out.println();
                break;

            case 'B':
                System.out.println("Please enter amount to deposit: ");
                amount = fetch.nextDouble();
                System.out.println();
                deposit(amount);
                System.out.println();
                break;

            case 'C':
                System.out.println("====================================");
                System.out.println("Your total balance is: " + balance);
                System.out.println("====================================");
                break;

            case 'D':
                System.out.println("====================================");
                mostRecentTransaction();
                System.out.println("====================================");
                break;

            case 'E':
                System.out.println("====================================");
                System.out.println("Thank you for banking with us.");
                System.out.println("====================================");

        }

        
    }

    public static void main(String[] args) {
        Bank ross = new Bank("Ross Turpin", 385915);
        ross.displayMenu();
    }
}



 

