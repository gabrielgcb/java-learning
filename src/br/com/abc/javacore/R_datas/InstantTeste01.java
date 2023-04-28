package br.com.abc.javacore.R_datas;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); //Zulu time, meridiano de greenwichj
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }
}
