package practice_inheritance;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public SalariedEmployee(String name, String dob, String hireDate, double annualSalary) {
        super(name, dob, hireDate);
        this.annualSalary = annualSalary;
    }
}
