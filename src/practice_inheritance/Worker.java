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

    private static int calculateAge(LocalDate birthDate) {
        if ((birthDate != null)) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }
    public int getAge(String startDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birthDateParsed = dateFormat.parse(startDate);
        LocalDate birthLocalDate = convertToLocalDate(birthDateParsed);
        int age = calculateAge(birthLocalDate);
        return age;
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
