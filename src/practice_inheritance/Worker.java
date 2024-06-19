package practice_inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    private static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private static int calculateDiff(LocalDate startDate) {
        if ((startDate != null)) {
            System.out.println("startDate "+ startDate);
            System.out.println("currentDate "+ LocalDate.now());
            return Period.between(startDate, LocalDate.now()).getMonths();
        } else {
            return 0;
        }
    }
    public int getDateDiff(String startDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date startDateParsed = dateFormat.parse(startDate);
        LocalDate startLocalDate = convertToLocalDate(startDateParsed);
        int diff = calculateDiff(startLocalDate);
        return diff;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public double collectPay(){
        return 0;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void terminate(String endDate){}
}
