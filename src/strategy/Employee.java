package strategy;

public class Employee {
    private String cin;
    private float grossMonthlySalary;
    private IEmployeeStrategy employeeStrategy;

    public Employee(String cin, float grossMonthlySalary) {
        this.cin = cin;
        this.grossMonthlySalary = grossMonthlySalary;
    }

    public float calculateIGR(){
       return employeeStrategy.calculateIGR(grossMonthlySalary);
    }

    public float getMonthlyNetSalary(){
        float igr=calculateIGR();
        float annualNetSalary=grossMonthlySalary*12-igr;
        return annualNetSalary/12;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getGrossMonthlySalary() {
        return grossMonthlySalary;
    }

    public void setGrossMonthlySalary(float grossMonthlySalary) {
        this.grossMonthlySalary = grossMonthlySalary;
    }

    public void setEmployeeStrategy(IEmployeeStrategy employeeStrategy) {
        this.employeeStrategy = employeeStrategy;
    }
}