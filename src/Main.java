import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


public class Main {
    private static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null)) {
            return Period.between(birthDate, currentDate).getDays();
        } else {
            return 0;
        }
    }
    public static void main(String[] args) throws ParseException {
        LocalDate d1 = LocalDate.of(1996, 12, 19);
        LocalDate d2 = LocalDate.now();
        String birthDateString = "19-12-1996";
        String currentDateString = "19-6-2024";

        System.out.println(Period.between(d1, d2).getDays());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birthDate = dateFormat.parse(birthDateString);
        Date currentDate = dateFormat.parse(currentDateString);

        // Step 2: Convert Date objects to LocalDate
        LocalDate birthLocalDate = convertToLocalDate(birthDate);
        LocalDate currentLocalDate = convertToLocalDate(currentDate);

        // Step 3: Calculate the age
        int age = calculateAge(birthLocalDate, currentLocalDate);

        System.out.println("Age: " + age);

    }
}