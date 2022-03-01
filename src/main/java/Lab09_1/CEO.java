package Lab09_1;

public class CEO extends Employee {

    private static final double basicSalary = 100;
    private static final double supportSalary = 0;

    public CEO() {
        super(basicSalary, supportSalary);
    }

    public CEO(double salary, double supportSalary) {
        super(salary, supportSalary);
    }
}
