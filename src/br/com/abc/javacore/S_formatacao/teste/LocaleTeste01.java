package br.com.abc.javacore.S_formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("jp", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia : " + df1.format(calendar.getTime()));
        System.out.println("Suica: " + df2.format(calendar.getTime()));
        System.out.println("Japao: " + df3.format(calendar.getTime()));
        System.out.println("India: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeIndia.getDisplayCountry(localeJapao));

    }
}
