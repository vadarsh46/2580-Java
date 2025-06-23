public class Bank {
    public static void main(String[] args) {
        String customerName = "VS Adarsh";
        String accountNumber = "08765321050";
        int customerIFSCCode = 510288;
        double balance = 5000.56;
        boolean isActive = true;
        int numberOfTransactions = 5;
        double depositAmount = 2000.0;
        double withdrawalAmount = 1000.0;

        // Perform deposit and withdrawal
        //Arithmetic: Update the balance after deposit and withdrawal.
        //Relational: Check if balance is below minimum threshold.
        //Logical: Verify if deposit is valid and account is active.
        //Increment: Increase number of transactions with each operation.

        double totalAmountAfterDeposit = balance + depositAmount;
        numberOfTransactions++;
        double totalAmountAfterWithdrawal = totalAmountAfterDeposit - withdrawalAmount;
         numberOfTransactions++;
        boolean isMinimumBalance = balance <= 1000;

        boolean isVerified = depositAmount > 0 && isActive;

       

        //output

        System.out.println("Account holder name: " + customerName);
        //System.out.println("Account number: " + accountNumber);
        //System.out.println("IFSC Code: " + customerIFSCCode);
        //System.out.println("Minimum balance warning: " + isMinimumBalance);
        //System.out.println("Account is active: " + isActive);
        //System.out.println("Deposit verified: " + isVerified);
        System.out.println("Final balance: " + totalAmountAfterWithdrawal);
        System.out.println("Number of transactions: " + numberOfTransactions);
    }
}