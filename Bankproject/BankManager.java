package likeLionTestQ.Bankproject;

import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
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

            while (true) {
                switch (num) {
                    case 1:
                        // 고객 등록
                        System.out.print("고객 이름을 입력하세요: ");
                        String name = sc.nextLine();
                        System.out.print("고객 ID를 입력하세요: ");
                        String id = sc.nextLine();
                        bank.addCustomer(name, id);
                        // 고객
                        sc.nextLine();

                        break;

                    case 2:
                        // 계좌 생성
                        System.out.print("고객 ID를 입력하세요: ");
                        System.out.print("계좌번호를 입력하세요: ");


                        break;

                    case 3:
                        // 입금
                        System.out.print("계좌번호를 입력하세요: ");
                        System.out.print("입금액을 입력하세요: ");


                        break;

                    case 4:
                        // 출금
                        System.out.print("계좌번호를 입력하세요: ");

                        System.out.print("출금액을 입력하세요: ");


                        break;

                    case 5:
                        // 잔액 조회
                        System.out.print("고객 ID를 입력하세요: ");

                        System.out.print("계좌번호를 입력하세요: ");


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
}


