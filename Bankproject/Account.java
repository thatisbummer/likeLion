package likeLionTestQ.Bankproject;

public class Account {
    private String[] accountNumber = new String[100]; //
    private String customerID;
    private int balance;

    public Account() {

    }

    public Account(String[] accountNumber, String customerID, int balance) {
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = balance;
    }

    public String[] getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String[] accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int money) throws InvalidTransactionException {
        this.balance += money;
        System.out.println(money + "원 입금완료했습니다.");
        System.out.println("현재 잔액: " + balance);
        if (money == 0) {
            throw new InvalidTransactionException("0원 이하로는 입력이 불가능 합니다.");
        }
    }
    public void withdraw(int money) throws InvalidTransactionException {
        if(this.balance < money){
            throw new InvalidTransactionException("잔고보다 출금 금액이 더 큽니다.");
        }
            this.balance -= money;
            System.out.println(money + "원 출금완료했습니다.");
            System.out.println("현재 잔액: " + balance);
            if (money == 0) {
                throw new InvalidTransactionException("0원 이하로는 입력이 불가능 합니다.");
            }
    }
    // 잔액조회
    public void checkAccount(){
        System.out.println(accountNumber + "의 남은 잔액은" + balance + "입니다.");
    }
    //계좌번호
    //소유고객 ID

}
