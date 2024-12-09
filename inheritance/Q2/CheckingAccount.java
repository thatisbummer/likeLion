package likeLionTestQ.inheritance.Q2;

public class CheckingAccount extends BankAccount{
    int overdraftLimit;

    public CheckingAccount(int balance, int overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void showBalance() {
        super.showBalance();
        System.out.print(", 초과 인출 한도: " + overdraftLimit);
    }
}
