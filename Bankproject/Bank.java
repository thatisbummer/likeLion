package likeLionTestQ.Bankproject;

public class Bank {
    private Customer[] customers = new Customer[100];
    int customerCount = 0;

    public Bank() {

    }

    void addCustomer(String name, String Id) {

        for (int i = 0; i < 100; i++) {
            if(customers[i].getCustomerID().equals(Id)) {
                System.out.println("이미 등록된 사람입니다.");
                return;
            } else {
                customers[customerCount] = new Customer(name, Id); // 이게 편한듯
//                Customer customers1 = new Customer(name, Id);
//                customers[customerCount] = customers1;
                customerCount++;
                System.out.println("등록이 완료되었습니다.");
            }
        }
    }
    // 고객조회 자리
    public void customerFindAccount(String customerId) { // id 검색으로 계좌 정보 조회
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerID().equals(customerId)) {
                Account[] accounts = customers[i].getAccounts();
                System.out.println(customers[i].getCustomerName() + "님의 회원정보를 읽어오고있습니다.");
            } else{
                System.out.println("동일한 ID가 없습니다.");
            }
            for (int j = 0; j < 5; j++) {
                if (customers[i].accounts[j] != null) {
                    System.out.println("계좌번호는: " + customers[i].accounts[j].getAccountNumber() + "입니다.");
                }
            }
            for (int j = 0; j < 5; j++) {
                if (customers[i].accounts[j] == null) { //예외처리 할것

                }
            }
        }
    }
}
