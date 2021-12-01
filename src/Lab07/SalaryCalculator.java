package Lab07;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {

        InfoOfEmployee ceo1 = new CEO();

        InfoOfEmployee manager1 = new Manager();
        InfoOfEmployee manager2 = new Manager();

        InfoOfEmployee standardEmployee1 = new StandardEmployee();
        InfoOfEmployee standardEmployee2 = new StandardEmployee();
        InfoOfEmployee standardEmployee3 = new StandardEmployee();
        InfoOfEmployee standardEmployee4 = new StandardEmployee();
        InfoOfEmployee standardEmployee5 = new StandardEmployee();
        InfoOfEmployee standardEmployee6 = new StandardEmployee();
        InfoOfEmployee standardEmployee7 = new StandardEmployee();

        int totalMonthlySalaries;

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        List<InfoOfEmployee> infoOfEmployees = new ArrayList<>();
        infoOfEmployees.add(ceo1);
        infoOfEmployees.add(manager1);
        infoOfEmployees.add(manager2);
        infoOfEmployees.add(standardEmployee1);
        infoOfEmployees.add(standardEmployee2);
        infoOfEmployees.add(standardEmployee3);
        infoOfEmployees.add(standardEmployee4);
        infoOfEmployees.add(standardEmployee5);
        infoOfEmployees.add(standardEmployee6);
        infoOfEmployees.add(standardEmployee7);

        totalMonthlySalaries = salaryCalculator.Calculator(infoOfEmployees);
        System.out.println("Monthly Salary for Company is: " + totalMonthlySalaries);
    }

    public int Calculator(List<InfoOfEmployee> employees) {

        int totalMonthlySalaries = 0;
        for (InfoOfEmployee employee : employees) {
            totalMonthlySalaries += employee.getEmployeeSalary() + employee.getEmployeeSupportSalary();
        }
        return totalMonthlySalaries;

    }


}

