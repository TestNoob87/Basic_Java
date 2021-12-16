package Lab09_1;

public class Manager extends Employee {

    private static final double basicSalary = 50;
    private static final double supportSalary = 3;

    public Manager() {
        super(basicSalary, supportSalary);
    }

    public Manager(double salary, double supportSalary) {
        super(salary, supportSalary);
    }
}
