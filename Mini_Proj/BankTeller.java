public class BankTeller {
    public static double branchVaultBalance=500000.00;
    public static int totalTransactionsToday=0;

    private String tellerName;

    public BankTeller(String tellerName){
        super();
        this.tellerName = tellerName;
        System.out.println("Teller logged in: "+this.tellerName);
        
    }

    public void acceptDeposit(double amount){
        branchVaultBalance += amount;
        totalTransactionsToday++;
        System.out.println("Checked "+this.tellerName+" Processed a deposit of ₹"+amount+" | Branch vault: ₹"+branchVaultBalance);
    }

    public void processWithdrawal(double amount){
        if(amount<=branchVaultBalance){
            branchVaultBalance -= amount;
            totalTransactionsToday++;
            System.out.println("Withdrawal "+this.tellerName+" Processed a withdrawal of ₹"+amount+" | Branch vault: ₹"+branchVaultBalance);
        }else{
            System.out.println(" X "+this.tellerName+" Declined withdrawal of ₹"+amount+" Due to insufficient funds in branch vault");
        }
    }
}
