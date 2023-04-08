package br.com.abc.introducao.leiturateclado;

import java.util.Scanner;

public class LeituraTecladoTeste2 {
    public static void main(String... args) {

        System.out.println("O grande software de previsao do futuro...");
        System.out.println("Digite a sua pergunta abaixo e eu responderei SIM ou NAO:");

        Scanner scan = new Scanner(System.in);
        String pergunta = scan.nextLine();
        if(pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

    }
}
