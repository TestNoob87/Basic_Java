package Lab09_1;

public class StandardEmployee extends Employee {

    private static final double basicSalary = 30;
    private static final double supportSalary = 5;

    public StandardEmployee() {
        super(basicSalary, supportSalary);
    }

    public StandardEmployee(double salary, double supportSalary) {
        super(salary, supportSalary);
    }
}
