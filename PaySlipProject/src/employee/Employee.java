package employee;

public abstract class Employee {

    protected int empId;
    protected String name;
    protected double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();
}