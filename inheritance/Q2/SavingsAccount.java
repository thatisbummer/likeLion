package likeLionTestQ.inheritance.Q2;

public class SavingsAccount extends BankAccount{
    int interestRate;

    public SavingsAccount(int balance, int interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void showBalance() {
        super.showBalance();
        System.out.println(", 이자율: " + interestRate);
    }
}
