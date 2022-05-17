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

    //Method for withdrawals
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

    //Method for deposits
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid request, deposit amount must equal above £0");
        } else {
            balance += amount;
            lastTransaction = amount;
            System.out.println("Deposit of £" + amount + " successful, new balance: £" + balance);
        }
    }

    //Method to display the most recent transaction
    public void mostRecentTransaction() {
        if (lastTransaction < 0) {
            System.out.println("Your most recent transaction:");
            System.out.println();
            System.out.println("Withdrawn: £" + lastTransaction);
        } else if (lastTransaction > 0) {
            System.out.println("Your most recent transaction:");
            System.out.println();
            System.out.println("Deposited: £" + lastTransaction);
        } else {
            System.out.println("No recent transactions to display.");
        }
    }

    //Method for the main menu feature
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
        char next;
        char next1;
        System.out.println();

        switch(option) {
            //Case 'A' allows the user to withdraw money using the 'withdraw' method
            case 'A':
                System.out.println("Please enter amount to withdraw: ");
                amount = fetch.nextDouble();
                System.out.println();
                System.out.println();
                System.out.println("==============================================================");
                withdraw(amount);
                System.out.println("==============================================================");
                System.out.println();
                System.out.println("Please select an option:");
                System.out.println("A - Back to menu");
                System.out.println("B - Exit");
                System.out.println();
                System.out.println("Enter option: ");
                next1 = fetch.next().charAt(0);
                next = Character.toUpperCase(next1);
                if (next <= 'A') {
                    displayMenu();
                } else if (next <= 'B') {
                    System.out.println("====================================");
                    System.out.println("Thank you for banking with us.");
                    System.out.println("====================================");
                } else {
                    System.out.println("Error. Invalid option. Returning to main menu.");
                    displayMenu();
                }
                break;

            //Case 'B' allows the user to deposit money using the 'deposit' method
            case 'B':
                System.out.println("Please enter amount to deposit: ");
                amount = fetch.nextDouble();
                System.out.println();
                System.out.println();
                System.out.println("====================================================");
                deposit(amount);
                System.out.println("====================================================");
                System.out.println();
                System.out.println("Please select an option:");
                System.out.println("A - Back to menu");
                System.out.println("B - Exit");
                System.out.println();
                System.out.println("Enter option: ");
                next1 = fetch.next().charAt(0);
                next = Character.toUpperCase(next1);
                if (next <= 'A') {
                    displayMenu();
                } else if (next <= 'B') {
                    System.out.println("====================================");
                    System.out.println("Thank you for banking with us.");
                    System.out.println("====================================");
                } else {
                    System.out.println("Error. Invalid option. Returning to main menu.");
                    displayMenu();
                }
                break;

            //Case 'C' displays the user's current balance
            case 'C':
                System.out.println();
                System.out.println();
                System.out.println("====================================");
                System.out.println("Your total balance is: £" + balance);
                System.out.println("====================================");
                System.out.println();
                System.out.println();
                System.out.println("Please select an option:");
                System.out.println("A - Back to menu");
                System.out.println("B - Exit");
                System.out.println();
                System.out.println("Enter option: ");
                next1 = fetch.next().charAt(0);
                next = Character.toUpperCase(next1);
                if (next <= 'A') {
                    displayMenu();
                } else if (next <= 'B') {
                    System.out.println("====================================");
                    System.out.println("Thank you for banking with us.");
                    System.out.println("====================================");
                } else {
                    System.out.println("Error. Invalid option. Returning to main menu.");
                    displayMenu();
                }
                break;

            //Case 'D' displays the user's most recent transaction using the 'mostRecentTransaction' method
            case 'D':
                System.out.println();
                System.out.println("====================================");
                mostRecentTransaction();
                System.out.println("====================================");
                System.out.println();
                System.out.println();
                System.out.println("Please select an option:");
                System.out.println("A - Back to menu");
                System.out.println("B - Exit");
                System.out.println();
                System.out.println("Enter option: ");
                next1 = fetch.next().charAt(0);
                next = Character.toUpperCase(next1);
                if (next <= 'A') {
                    displayMenu();
                } else if (next <= 'B') {
                    System.out.println("====================================");
                    System.out.println("Thank you for banking with us.");
                    System.out.println("====================================");
                } else {
                    System.out.println("Error. Invalid option. Returning to main menu.");
                    displayMenu();
                }
                break;

            //Case 'E' exits the program
            case 'E':
                System.out.println("====================================");
                System.out.println("Thank you for banking with us.");
                System.out.println("====================================");
                break;
            
            //Default tells the user that they have entered an invalid option, and returns them to the main menu
            default:
                System.out.println("===============================================");
                System.out.println("Error. Invalid option. Returning to main menu.");
                System.out.println("===============================================");
                displayMenu();
                break;

        }

        
    }

    public static void main(String[] args) {
        Bank employer = new Bank("Potential Employer", 385915);
        employer.displayMenu();
    }
}



 

