package section10Exercises.entities;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee (int employeeId, String employeeName, double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void salaryIncrease (double percentage){
        setEmployeeSalary(getEmployeeSalary() * (1 + percentage / 100));
    }

    @Override
    public String toString() {
        return String.format("ID: %d \n Nome: %s \n Salario: %.2f", getEmployeeId(), getEmployeeName(), getEmployeeSalary());
    }
    
}
