package practice_inheritance;

import java.text.ParseException;
import java.util.Random;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    Employee(String name, String dob, String hireDate){
        super(name, dob);
        Random randomNum = new Random();
        this.employeeId = randomNum.nextLong(50);
        this.hireDate = hireDate;
    }

    public int daysWorked(String hireDate) throws ParseException {
        return super.getDateDiff(hireDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
