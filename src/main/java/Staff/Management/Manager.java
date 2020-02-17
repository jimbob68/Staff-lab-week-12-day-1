package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName){
        super("Bob", "NI12345", 20000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
