package main;

import java.util.Scanner;
import salary.Salary;

public class PaySlip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Salary emp = new Salary(id, name, basicSalary);

        emp.displayPaySlip();

        sc.close();
    }
}