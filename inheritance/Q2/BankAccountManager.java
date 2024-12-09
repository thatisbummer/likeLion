package likeLionTestQ.inheritance.Q2;

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount(10000,1);
        BankAccount account2 = new CheckingAccount(10000,200000);

        account1.showBalance();
        account2.showBalance();

    }
}
