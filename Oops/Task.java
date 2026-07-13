package Oops;

// employee ->name, salary, employeeId
class Employee {
    public String empName;
    private double salary;
    private int employeeId;
    private int password;
    protected String department;

    // for set the name of the emp.
    public String setName(String newName) {
        return this.empName = newName;
    }

    // for the salary
    // setter ->salary set
    double setSalary(double newSalary) {
        return this.salary = newSalary;
    }

    // getter -> salary get
    double getSalary() {
        return this.salary;
    }

    // setter ->employeeId set
    int setEmdId(int newId) {
        return this.employeeId = newId;
    }

    // getter -> employeeId get
    int getEmpId() {
        return this.employeeId;
    }

    // setter ->password set
    int setPassword(int password) {
        return this.password = password;
    }

    // getter -> password get
    int getPassword() {
        return this.password;
    }

    void printDepartment() {
        System.out.println(department);
    }

    // for print all details
    void printDetails() {
        System.out.println("------------Information Employee----------");
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee Id :" + employeeId);
        System.out.println("Employee Salary :" + salary);
    }

}

public class Task {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.department = "Information technology";
        // emp1.empName = "Shreya";
        emp1.setName("Shreya");
        emp1.setEmdId(12345);
        emp1.setSalary(50000);
        emp1.setPassword(654321);

        // --------------------------------
        emp1.printDetails();
        emp1.printDepartment();

        // /-------------------
        System.out.println(emp1.getSalary());
    }

}
