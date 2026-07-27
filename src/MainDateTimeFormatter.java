import java.time.*;
import java.time.format.*;
import java.util.Calendar;
import java.util.Date;


public class MainDateTimeFormatter {
    public static void main(String[] args){
        LocalDate localdate = LocalDate.now();
        String strdate = "22/07/2026";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("Our Format");
        System.out.println(localdate.format(formatter1));
        System.out.println("Iso Week Date");
        System.out.println(localdate.format(formatter2));
        System.out.println("Our Format");
        System.out.println(LocalDate.parse(formatter1.format(localdate), formatter1));
        LocalDateTime localDateTime = LocalDateTime.now();

        Date date = Date.from((localDateTime.toInstant(ZoneOffset.ofHours(-3))));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        LocalDateTime localDateTime1 = localDateTime.ofInstant(calendar.toInstant(), zoneId);
        System.out.println(localDateTime1);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTimeUTC = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);

        System.out.println(offsetDateTime.isEqual(offsetDateTimeUTC));
    }
}
