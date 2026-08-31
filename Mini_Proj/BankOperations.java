
import java.util.Scanner;

public class BankOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Branch Opening Vault Balance: ₹" + BankTeller.branchVaultBalance);
        System.out.println("---------------------------------------------");

        BankTeller window1 = new BankTeller("Nitin");
        BankTeller window2 = new BankTeller("Piku");
        BankTeller window3 = new BankTeller("Shaun");

        window1.acceptDeposit(100000);
        window2.processWithdrawal(200000);
        window3.acceptDeposit(500000);

        int choice;
        BankTeller selectedTeller = window1;

        while (true) {
            System.out.println("\n========== BANK MENU ==========");
            System.out.println("1. Select Teller");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Branch Balance");
            System.out.println("5. Check Total Transactions");
            System.out.println("6. End of Day Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("\nSelect Teller:");
                    System.out.println("1. Nitin");
                    System.out.println("2. Piku");
                    System.out.println("3. Shaun");
                    System.out.print("Enter teller: ");

                    int tellerChoice = sc.nextInt();

                    switch (tellerChoice) {
                        case 1:
                            selectedTeller = window1;
                            System.out.println("Nitin selected.");
                            break;

                        case 2:
                            selectedTeller = window2;
                            System.out.println("Piku selected.");
                            break;

                        case 3:
                            selectedTeller = window3;
                            System.out.println("Shaun selected.");
                            break;

                        default:
                            System.out.println("Invalid teller choice.");
                    }
                    break;


                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();

                    selectedTeller.acceptDeposit(depositAmount);
                    break;


                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawalAmount = sc.nextDouble();

                    selectedTeller.processWithdrawal(withdrawalAmount);
                    break;


                case 4:
                    displayBalance();
                    break;


                case 5:
                    displayTotalTransactions();
                    break;


                case 6:
                    endOfDayReport();
                    break;


                case 7:
                    System.out.println("\nThank you for using the Bank System!");
                    sc.close();
                    return;


                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    // Method to display current branch balance
    public static void displayBalance() {

        System.out.println("\n---------------------------------------------");
        System.out.println("Current Branch Vault Balance: ₹"
                + BankTeller.branchVaultBalance);
        System.out.println("---------------------------------------------");
    }


    // Method to display total transactions
    public static void displayTotalTransactions() {

        System.out.println("\n---------------------------------------------");
        System.out.println("Total Transactions Today: "
                + BankTeller.totalTransactionsToday);
        System.out.println("---------------------------------------------");
    }


    // Method for end-of-day report
    public static void endOfDayReport() {

        System.out.println("\n========== END OF DAY REPORT ==========");
        System.out.println("Final Branch Vault Balance: ₹"
                + BankTeller.branchVaultBalance);

        System.out.println("Total Transactions Processed: "
                + BankTeller.totalTransactionsToday);

        System.out.println("=======================================");
    }
}