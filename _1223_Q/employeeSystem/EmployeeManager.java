package likeLionTestQ._1223_Q.employeeSystem;

import java.util.HashSet;

public class EmployeeManager {
    HashSet<Employee> set = new HashSet<>();

    public void addEmployee(String name, String id, String department) {
        set.add(new Employee(name,id,department));
    }

    public void removeEmployee(Employee employee) {
        if (set.remove(employee)) {
            System.out.println(employee + "사원은 삭제되었습니다.");
        } else {
            System.out.println(employee + "사원은 찾을수없습니다.");
        }
    }

    public Employee findEmployee(String id) {
        for (Employee employee : set) {
            if (employee != null && employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
