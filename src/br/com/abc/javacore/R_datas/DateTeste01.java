package br.com.abc.javacore.R_datas;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1_682_360_915_570L); // long 100_000_000_000L representa milisegundos
        System.out.println(date);
    }
}
