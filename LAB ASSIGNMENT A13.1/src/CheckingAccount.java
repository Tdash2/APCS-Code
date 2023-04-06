public class CheckingAccount{
    private double myBalance;
    private int myAccountNumber;

    /**
     * Makes a new checking account.
     */
    public CheckingAccount(){
        myBalance = 0.0;
        myAccountNumber = 0;
    }

    /**
     * Makes new checking account with the balance and account number given.
     *
     * @param initialBalance the initial balance of the account
     * @param acctNum the account number
     * @throws IllegalArgumentException if the initial balance is negative
     */
    public CheckingAccount(double initialBalance, int acctNum){
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        myBalance = initialBalance;
        myAccountNumber = acctNum;
    }

    /**
     * Returns the current balance of the account.
     * @return the current balance of the account
     */
    public double getBalance(){
        return myBalance;
    }

    /**
     * Deposits the amount into the account.
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is negative
     */
    public void deposit(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative amount");
        }
        myBalance += amount;
    }

    /**
     * Withdraws the amount from the account.
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is negative or if the withdrawal would result in an overdraft
     */
    public void withdraw( double amount ){
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        if (myBalance - amount < 0) {
            throw new IllegalArgumentException("Cannot overdraw the account");
        }
        myBalance -= amount;
    }
}
