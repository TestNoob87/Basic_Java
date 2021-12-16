package Lab09_1;

import java.util.ArrayList;
import java.util.List;

public class MonthlySalary {

    public static void main(String[] args) {

        CEO ceo1 = new CEO();
        Manager manager1 = new Manager();
        StandardEmployee standardEmployee1 = new StandardEmployee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(ceo1);
        employeeList.add(manager1);
        employeeList.add(standardEmployee1);

        double monthlySalaryOfCompany = totalSalary(employeeList);
        System.out.println(monthlySalaryOfCompany);
    }

    public static double totalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.salary + employee.supportSalary;
        }
        return totalSalary;
    }
}
