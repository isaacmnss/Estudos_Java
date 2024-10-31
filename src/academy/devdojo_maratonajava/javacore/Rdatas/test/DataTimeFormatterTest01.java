package academy.devdojo_maratonajava.javacore.Rdatas.test;

import academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeFormatterTest01 {
    public static void main(String[] args) {
        // format = Objeto -> String
        // parse = String -> Objeto
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-10-30", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-10-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-10-30T21:48:29.1684242", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/02/2021", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dtf1);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("30.Oktober.2024", dtf1);
        System.out.println(parseGR);
    }
}
