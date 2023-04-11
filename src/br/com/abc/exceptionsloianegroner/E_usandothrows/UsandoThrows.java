package br.com.abc.exceptionsloianegroner.E_usandothrows;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {

        System.out.print("Entre com um numero decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Voce digitou: " + num);
        } catch(Exception e) {
            System.out.println("Entrada invalida.");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        return numero;
    }

}
