package academy.devdojo_maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale LocaleItaly = new Locale("it","IT");
        Locale LocaleCH = new Locale("it","CH");
        Locale LocaleIndia = new Locale("hi","HI");
        Locale LocaleJapao = new Locale("ja","JP");
        Locale LocaleHolanda = new Locale("nl","NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,LocaleItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,LocaleCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,LocaleIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,LocaleJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,LocaleHolanda);
        System.out.println("Itália: "+df1.format(calendar.getTime()));
        System.out.println("Suíça: "+df2.format(calendar.getTime()));
        System.out.println("Índia: "+df3.format(calendar.getTime()));
        System.out.println("Japão: "+df4.format(calendar.getTime()));
        System.out.println("Holanda: "+df5.format(calendar.getTime()));

        System.out.println(LocaleItaly.getDisplayCountry());
        System.out.println(LocaleCH.getDisplayCountry(LocaleCH));
    }
}
