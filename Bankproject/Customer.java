package likeLionTestQ.Bankproject;

public class Customer {
    String customerName;
    Account[] accounts = new Account[5];
    String customerID;

    public int getAccountCount() {
        return accountCount;
    }

    public void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }

    int accountCount = 0; //계좌를 만들면 하나씩 증가함

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;

        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public void addAccount(Account accountNum) throws BankOperationException{
            if (!(accounts.length > accountCount)) {
               throw new BankOperationException("계좌가 이미 5개 입니다.");
            }
            else{
                accounts[accountCount] = accountNum;
                accountCount++;
                System.out.println("계좌가 추가되었습니다.");
            }
    }
    public void accountCheck(Account account) throws AccountNotFoundException{ //계좌번호 조회 메서드
        for(Account account2 : accounts) {

            if (account2.equals(account)) {
                System.out.println("현재 계좌 잔액: " + account.getBalance());
            }else {
                throw new AccountNotFoundException("없는 계좌번호입니다.");
            }
        }
    }

    public Customer() {

    }
}
