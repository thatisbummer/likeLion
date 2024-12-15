package likeLionTestQ.Bankproject;

import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) throws AccountNotFoundException {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 라이온 은행 시스템 ===");
            System.out.println("1. 고객 등록");
            System.out.println("2. 계좌 생성");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 잔액 조회");
            System.out.println("6. 종료");
            System.out.print("선택하세요: ");
            int num = sc.nextInt();
            sc.nextLine();

                switch (num) {
                    case 1:
                        // 고객 등록
                        System.out.print("고객 이름을 입력하세요: ");
                        String name = sc.nextLine();
                        System.out.print("고객 ID를 입력하세요: ");
                        String id = sc.nextLine();
                        bank.addCustomer(name, id);

                        break;

                    case 2:
                        // 계좌 생성
                        try {
                            System.out.print("ID를 입력하세요: ");
                            String customerId = sc.nextLine();

                            System.out.print("계좌번호를 입력하세요: ");
                            String accountNumber = sc.nextLine();

                            Account customerAccount = new Account(new String[]{accountNumber}, customerId, 0); // 계좌
                            Customer customer = bank.customerFindId(customerId);
                            if (customerId != null) {
                                customer.addAccount(customerAccount);
                            } else {
                                System.out.println("찾을수 없는 ID입니다.");
                            }
                        }catch (BankOperationException e) {
                            System.out.println(e);
                        }
                        break;


                    case 3:
                        // 입금
                        try {
                            System.out.print("계좌번호를 입력하세요: ");
                            String accountNum = sc.nextLine();
                            System.out.print("입금 금액을 입력하세요: ");
                            int money = sc.nextInt();
                            Account account1 = bank.customerFindAccountNumber(accountNum);
                            account1.deposit(money);
                        }catch (AccountNotFoundException e) {
                            System.out.println(e);
                        }catch (InvalidTransactionException e) {
                            System.out.println(e);
                        }

                        break;

                    case 4:
                        // 출금
                        try {
                        System.out.print("계좌번호를 입력하세요: ");
                        String accountNum2 = sc.nextLine();
                        System.out.print("출금 금액을 입력하세요: ");
                        int money2 = sc.nextInt();
                            Account account2 = bank.customerFindAccountNumber(accountNum2);
                            account2.withdraw(money2);
                        }catch (InvalidTransactionException e) {
                            System.out.println(e);
                        } catch (AccountNotFoundException e) {
                            System.out.println(e);
                        }

                        break;

                    case 5:
                        // 잔액 조회
                        try {
                            System.out.print("잔액조회 하고싶은 계좌번호를 입력하세요: ");
                            String accountNum2 = sc.nextLine();
                            Account account = bank.customerFindAccountNumber(accountNum2);
                            account.checkAccount();
                        }catch (AccountNotFoundException e) {
                            System.out.println(e);
                        }

                        break;

                    case 6:
                        // 종료
                        System.out.println("종료");
                        return;

                    default:
                        System.out.println("잘못입력 다시 입력해.");
                }
            }
        }
    }



