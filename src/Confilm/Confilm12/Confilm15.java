package Confilm.Confilm12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Confilm15 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy,MM,dd");

        LocalDateTime startDateTime = LocalDateTime.of(2023, 8, 9, 0, 0, 0);
        System.out.println("시작일: " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2023, 12, 31, 0, 0, 0);
        System.out.println("종료일: " + endDateTime.format(dtf));
        System.out.println();

        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);

        System.out.println("남은 월: " + remainMonth);
        System.out.println("남은 일: " + remainDay);


    }
}
