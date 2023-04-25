package br.com.abc.javacore.R_datas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2023, Month.APRIL, 25);
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println("Data de hoje: " + date);
        System.out.println("Ano: " + date.getYear());
        System.out.println("Mes: " + date.getMonth());
        System.out.println("Dia do mes: " + date.getDayOfMonth());
        System.out.println("Dia do ano: " + date.getDayOfYear());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Qtd dias do mes: " + date.lengthOfMonth());
        System.out.println("Qtd dias do ano: " + date.lengthOfYear());
        System.out.println("Eh ano bissexto? " + date.isLeapYear());
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
