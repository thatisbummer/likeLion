package likeLionTestQ._1223_Q.employeeSystem;

import java.util.Scanner;

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        while(true) {
            System.out.println("사원 관리");
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 삭제");
            System.out.println("3. 사원 검색");
            System.out.println("4. 종료");
            System.out.print("원하시는 항목을 선택해주세요: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("사원 이름을 입력해주세요: ");
                    String name = sc.nextLine();
                    System.out.print("사원의 id를 입력해주세요: ");
                    String id = sc.nextLine();
                    System.out.print("사원의 부서를 입력해주세요: ");
                    String dept = sc.nextLine();
                    employeeManager.addEmployee(name,id,dept);
                    System.out.println("추가되었습니다.");
                    break;

                case 2:
                    System.out.print("삭제할 사원 이름을 입력해주세요: ");
                    String deleteName = sc.nextLine();
                    System.out.print("삭제할 사원 id를 입력해주세요: ");
                    String deleteId = sc.nextLine();
                    System.out.print("삭제할 사원의 부서를 입력해주세요: ");
                    String deleteDept = sc.nextLine();
                    Employee deleteEmployee = new Employee(deleteName,deleteId,deleteDept);
                    employeeManager.removeEmployee(deleteEmployee);
                    break;

                case 3:
                    System.out.print("검색할 사원의 id를 입력해주세요: ");
                    String findId = sc.nextLine();
                    Employee find = employeeManager.findEmployee(findId);
                    if (find != null) {
                        System.out.println(find);
                    } else System.out.println("찾을수 없는 id입니다.");
                    break;

                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }
}
