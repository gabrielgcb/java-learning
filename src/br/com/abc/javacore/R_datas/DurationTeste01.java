package br.com.abc.javacore.R_datas;

import br.com.abc.javacore.G_associacao.classes.Local;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8).plusSeconds(45);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(400);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}
