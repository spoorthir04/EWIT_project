package com.yourname.assignment;

import com.yourname.assignment.employees.*;
import com.yourname.assignment.utilities.*;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        EmployeeUtilities utils = new EmployeeUtilities();

        utils.showEmployeeDetails(manager);
        utils.showEmployeeDetails(developer);

        utils.increaseSalary(manager, 10);
        utils.increaseSalary(developer, 15);

        System.out.println("\nAfter Salary Increment:");
        utils.showEmployeeDetails(manager);
        utils.showEmployeeDetails(developer);
    }
}

