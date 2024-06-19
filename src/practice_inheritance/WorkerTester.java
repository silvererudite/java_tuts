package practice_inheritance;

import java.text.ParseException;

public class WorkerTester {
    public static void main(String[] args) throws ParseException {
        //Worker genericWorker = new Worker("Shamima","19-12-1996");
        //System.out.println("Age of generic worker "+ genericWorker.getAge());
        SalariedEmployee slaveOne = new SalariedEmployee("Shamima", "19-12-1996","25-06-2023", 5000);
        System.out.println(slaveOne.daysWorked("25-06-2023"));
    }
}
