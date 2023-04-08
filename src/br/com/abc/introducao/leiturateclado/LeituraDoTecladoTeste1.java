package br.com.abc.introducao.leiturateclado;

import java.util.Scanner;

public class LeituraDoTecladoTeste1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = scan.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite M ou F para o seu sexo: ");
        char sexo = scan.next().charAt(0);
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);

    }
}
