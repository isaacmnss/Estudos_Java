package academy.devdojo_maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 6);
        LocalTime time = LocalTime.of(9, 45, 30);
        System.out.println(ldt);
        System.out.println(ldt.getHour());
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
    }
}
