package likeLionTestQ.inheritance.Q2;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void showBalance() {
        System.out.print("잔액 : " + balance);
    }
}
