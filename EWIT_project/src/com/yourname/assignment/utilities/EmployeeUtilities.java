package com.yourname.assignment.utilities;


import com.yourname.assignment.employees.Employee;


public class EmployeeUtilities {

  
    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }

   
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary increased by " + percentage + "%. New salary: " + newSalary);
    }

    /**
     * Displays complete employee information.
     */
    public void showEmployeeDetails(Employee employee) {
        employee.displayInfo();
        System.out.println("Annual Salary: " + calculateAnnualSalary(employee));
        System.out.println("---------------------------------------");
    }
}

