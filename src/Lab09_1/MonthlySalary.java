package Lab09_1;

import java.util.ArrayList;
import java.util.List;

public class MonthlySalary {

    public static double totalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.salary + employee.supportSalary;
        }
        return totalSalary;
    }
}
