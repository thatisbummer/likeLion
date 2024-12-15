package likeLionTestQ.Bankproject;

public class Bank {
    private Customer[] customers = new Customer[100];
    int customerCount = 0;

    public Bank() {

    }

    void addCustomer(String name, String Id) {

        for (int i = 0; i < customerCount; i++) {
            if (customers[i] != null && customers[i].getCustomerID().equals(Id)) {
                System.out.println("이미 등록된 사람입니다.");
                return;
            }
        }
        customers[customerCount] = new Customer(name, Id); // 이게 편한듯
//                Customer customers1 = new Customer(name, Id);
//                customers[customerCount] = customers1;
        customerCount++;
        System.out.println("등록이 완료되었습니다.");
    }


    // 고객조회 자리
    public void customerFindAccount(String customerId) { // id 검색으로 계좌 정보 조회
        for (int i = 0; i < customerCount; i++) {
            if (customers[i] != null && customers[i].getCustomerID().equals(customerId)) {
                System.out.println(customers[i].getCustomerName() + "님의 회원정보를 읽어오고있습니다.");
                Account[] accounts = customers[i].getAccounts();
                if (accounts != null) {
                    for (int j = 0; j < accounts.length; j++) {
                        if (customers[i].accounts[j] != null) {
                            System.out.println("계좌번호는: " + customers[i].accounts[j].getAccountNumber() + "입니다.");
                        }
                    }
                } else {
                    System.out.println("등록된 계좌가 없습니다.");
                }
                return;
            }
        }
        System.out.println("존재하지 않는 ID입니다.");
    }

    public Account customerFindAccountNumber(String accountNumber) throws AccountNotFoundException{ // 계좌번호로 텅장 찾기
        for (int i = 0; i < customerCount; i++) {
            if(customers[i] != null) {
                Account[] accounts = customers[i].getAccounts();
                for (int j = 0; j < accounts.length; j++) {
                    if (accounts[j] != null) {
                        for (int k = 0; k < accounts[j].getAccountNumber().length; k++) {
                            if (accounts[j].getAccountNumber()[k].equals(accountNumber)) {
                                return accounts[j];
                            }
                        }
                    }
                }
            }
        }
        throw new AccountNotFoundException("계좌번호를 잘못 입력하셨습니다.");
    }

    public Customer customerFindId(String customerId) { // 아이디가 있는지 확인
        for (int i = 0; i < customerCount; i++) {
            if (customers[i] != null && customers[i].getCustomerID().equals(customerId)) {
                // System.out.println("원하시는 계좌 번호를 입력해주세요: ");
                return customers[i];
            }
        }
        // System.out.println("찾을수 없는 ID입니다.");
        return null;
    }
}
