package Lab09_1;

import java.util.ArrayList;
import java.util.List;

public class TestSalaryCalculator {

    public static void main(String[] args) {

        CEO ceo1 = new CEO();
        Manager manager1 = new Manager();
        StandardEmployee standardEmployee1 = new StandardEmployee();
        StandardEmployee standardEmployee2 = new StandardEmployee(25, 10);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(ceo1);
        employeeList.add(manager1);
        employeeList.add(standardEmployee1);
        employeeList.add(standardEmployee2);

        double monthlySalaryOfCompany = MonthlySalary.totalSalary(employeeList);
        System.out.println("Monthly Salary of Company is: " + monthlySalaryOfCompany);
    }
}
