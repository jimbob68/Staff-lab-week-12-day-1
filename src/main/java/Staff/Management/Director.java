package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;
    public Director(String name, String nINumber,int salary, double budget) {
        super(name, nINumber, salary );
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
