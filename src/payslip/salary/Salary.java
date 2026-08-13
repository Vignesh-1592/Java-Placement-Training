package salary;

import employee.Employee;

public class Salary extends Employee {

    private double hra;
    private double da;
    private double pf;

    public Salary(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    public double calculateSalary() {

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        pf = basicSalary * 0.12;

        return basicSalary + hra + da - pf;
    }

    public void displayPaySlip() {

        double netSalary = calculateSalary();

        System.out.println("---------- PAY SLIP ----------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("PF            : " + pf);
        System.out.println("Net Salary    : " + netSalary);
        System.out.println("------------------------------");
    }
}