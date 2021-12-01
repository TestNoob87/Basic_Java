package Lab07;

public class InfoOfEmployee {
    private String employeeName;
    private int employeeSalary;
    private int employeeSupportSalary;

    public InfoOfEmployee() {
    }

    public InfoOfEmployee(String employeeName, int employeeSalary, int employeeSupportSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeSupportSalary = employeeSupportSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeSupportSalary() {
        return employeeSupportSalary;
    }

    public void setEmployeeSupportSalary(int employeeSupportSalary) {
        this.employeeSupportSalary = employeeSupportSalary;
    }
}
