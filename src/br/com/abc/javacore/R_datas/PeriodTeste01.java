package br.com.abc.javacore.R_datas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofWeeks(40);
        Period p3 = Period.ofMonths(3);
        Period p4 = Period.ofYears(5);
        Period p5 = Period.ofDays(10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
