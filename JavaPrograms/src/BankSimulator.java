import java.util.Scanner;

public class BankSimulator {
    private int balance = 2500;
    private int previousTransaction = 0;

    public static void main(String args[]) {

        BankSimulator bankSimulator = new BankSimulator();

        String customerName = "Samarth";

        String customerId = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameCheck = sc.nextLine();

        if (customerName.equals(nameCheck) ) {
            System.out.println();
            System.out.println("What is your id?");
            String idCheck = sc.nextLine();
            if (customerId.equals(idCheck)) {
                bankSimulator.showMenu(sc, customerName, customerId);

            }
            else {
                System.out.println("Sorry your ID was incorrect.");
                return;
            }
        }
        else {
            System.out.println("Sorry you are not a customer in our database.");
            return;
        }

        sc.close();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction was occurred!");
        }
    }

    public void showMenu(Scanner sc, String customerName, String customerId) {
        char option;

        System.out.println("Welcome " + customerName);
        System.out.println("Your id is: " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        while (true) {
            System.out.println("Enter an option");
            option = sc.next().charAt(0);

            switch (Character.toUpperCase(option)) {
                case 'A':
                    System.out.println("Balance is: " + balance);
                    break;
                case 'B':
                    System.out.println("Enter the amount to deposit");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("Enter the amount to withdraw");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Thank you for using our services!");
                    return;
                default:
                    System.out.println("Invalid Option. Please try again");
                    break;
            }
        }
    }
}
